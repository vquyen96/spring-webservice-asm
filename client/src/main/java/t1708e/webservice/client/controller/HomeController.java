package t1708e.webservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.webservice.client.service.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = {"/", "/home"})
public class HomeController {
    @Autowired
    SignUpService signUpService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String index(Model model) throws RemoteException {
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        return "about";
    }

    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String blog(Model model) {
        return "blog";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Model model) {
        return "contact";
    }

    @RequestMapping(value = "/elements", method = RequestMethod.GET)
    public String elements(Model model) {
        return "elements";
    }

    @RequestMapping(value = "/offers", method = RequestMethod.GET)
    public String offers(Model model) {
        return "offers";
    }

    @RequestMapping(value = "/single_listing", method = RequestMethod.GET)
    public String single_listing(Model model) {
        return "single_listing";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginView(Model model) {
        return "login";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(Model model, String username, String password) throws RemoteException {
//        model.addAttribute("username", username);
//        model.addAttribute("password", password);
//        signInService.login(username, password);
//        return "login";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createStudent(Model model, User user) throws RemoteException {
        model.addAttribute("user", user);
        user.setRole(1);
        signUpService.create(user);
        return "redirect:/login";
    }
}
