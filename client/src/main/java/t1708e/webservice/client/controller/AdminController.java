package t1708e.webservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.webservice.client.service.Category;
import t1708e.webservice.client.service.CategoryService;
import t1708e.webservice.client.service.Place;
import t1708e.webservice.client.service.PlaceService;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    PlaceService placeService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "admin/index";
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String getCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "admin/category-form";
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public String createCategory(Model model, Category category) throws RemoteException {
        model.addAttribute("category", category);
        categoryService.save(category);
        return "redirect:/admin/index";
    }

    @RequestMapping(value = "/place", method = RequestMethod.GET)
    public String place(Model model) {
        model.addAttribute("place", new Place());
        return "admin/place-form";
    }

    @RequestMapping(value = "/place", method = RequestMethod.POST)
    public String createPlace(Model model, Place place) throws RemoteException {
        model.addAttribute("place", place);
        placeService.save(place);
        return "redirect:/admin/index";
    }

    @RequestMapping(value = "/placeimage", method = RequestMethod.GET)
    public String placeImage(Model model) {
        return "admin/placeImage-form";
    }
}
