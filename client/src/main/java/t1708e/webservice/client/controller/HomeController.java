package t1708e.webservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import t1708e.webservice.client.service.*;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = {"/home", "/"})
public class HomeController {

    @Autowired(required = false)
    private AdminController adminController;

    @Autowired(required = false)
    private SignUpService signUpService;

    @Autowired(required = false)
    private CategoryService categoryService;

    @Autowired(required = false)
    private SignInService signInService;


    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String index(Model model) throws RemoteException {
//        model.addAttribute("menu", "");
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model,
                        @RequestParam(value = "username", required = true) String username,
                        @RequestParam(value = "password", required = true) String password)
            throws RemoteException {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        signInService.login(username, password);
        return "redirect:/";
    }

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
