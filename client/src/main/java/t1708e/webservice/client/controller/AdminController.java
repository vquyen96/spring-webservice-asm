package t1708e.webservice.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "admin/index";
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String category(Model model) {
        return "admin/category-form";
    }

    @RequestMapping(value = "/place", method = RequestMethod.GET)
    public String place(Model model) {
        return "admin/place-form";
    }

    @RequestMapping(value = "/placeimage", method = RequestMethod.GET)
    public String placeImage(Model model) {
        return "admin/placeImage-form";
    }
}
