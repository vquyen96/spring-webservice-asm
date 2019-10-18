package t1708e.webservice.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class AbcController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
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
}
