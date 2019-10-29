package t1708e.webservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import t1708e.webservice.client.service.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

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
//        model.addAttribute("menu", AdminController.);
        model.addAttribute("listPlace", this.initList());
        model.addAttribute("cmtPlaceList", this.cmtPlaceList());
        model.addAttribute("cmtImageList", this.cmtImageList());
        return "index";
    }

    public List<Place> initList() {
        List<Place> listPlace = new ArrayList<>();
        listPlace.add(new Place( 25102019,(float) 9.5, "Mauritius", 29102019));
        listPlace.add(new Place( 25102019,(float) 9.0, "Mexico", 29102019));
        listPlace.add(new Place( 25102019,(float) 9.2, "Scotland", 29102019));
        return listPlace;
    }

    public List<CommentPlace> cmtPlaceList(){
        List<CommentPlace> cmtPlaceList = new ArrayList<>();
        cmtPlaceList.add(new CommentPlace( 26102019,"DoVanQuyen", "Best Holiday Ever", "Nullam eu convallis tortor. Suspendisse potenti. In faucibus massa arcu, vitae cursus mi hendrerit nec.", "https://images.thestar.com/Xhw4guc_RLQCfT-Z4kkFedb85OU=/1086x724/smart/filters:cb(1550117150394)/https://www.thestar.com/content/dam/thestar/life/travel/2019/02/13/ecotourism-has-taken-hold-of-the-caribbean-coast-of-mexico/mexico_ecotourism_akal_ki_01.jpg"));
        cmtPlaceList.add(new CommentPlace( 25102019,"DuongVanTrong", "Never Ever", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "https://cdn.cnn.com/cnnnext/dam/assets/170606121333-scotland---travel-destination---shutterstock-512226913.jpg"));
        cmtPlaceList.add(new CommentPlace( 25102019,"HoangHung", "Shift And Ctrl", " I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness.", "https://cdn.cnn.com/cnnnext/dam/assets/170606121333-scotland---travel-destination---shutterstock-512226913.jpg"));
        return cmtPlaceList;
    }

    public List<CommentImage> cmtImageList(){
        List<CommentImage> cmtImageList = new ArrayList<>();
        cmtImageList.add(new CommentImage("On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue.", "1914 translation by H. Rackham"));
        cmtImageList.add(new CommentImage("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.", "Why do we use it?"));
        return  cmtImageList;
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
