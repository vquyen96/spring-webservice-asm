package t1708e.webservice.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.webservice.client.entity.StatusEnum;
import t1708e.webservice.client.service.*;
import t1708e.webservice.client.serviceData.CategoryService;
import t1708e.webservice.client.serviceData.PlaceImageService;
import t1708e.webservice.client.serviceData.PlaceService;
import t1708e.webservice.client.serviceData.UserService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    protected CategoryService categoryService;
    protected PlaceService placeService;
    protected UserService userService;
    protected PlaceImageService placeImageService;



    public AdminController() {
        categoryService = new CategoryService();

        userService = new UserService();
        placeService = new PlaceService();
        placeImageService = new PlaceImageService();

        categoryService.init();
        userService.init();
        placeService.init(categoryService, userService);
        placeImageService.init(placeService);
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "admin/index";
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String getCategories(Model model) throws RemoteException {
        model.addAttribute("categories", categoryService.findAll());
        return "admin/category-list";
    }

    @RequestMapping(value = "/category-create", method = RequestMethod.GET)
    public String getCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "admin/category-form";
    }

    @RequestMapping(value = "/category-edit/{id}", method = RequestMethod.GET)
    public String getCategoryForm(Model model, @PathVariable("id") int id) {
        System.out.println(id);
        Category category = categoryService.findById(id);
        if (category == null) return "redirect:/admin/category";
        model.addAttribute("category", category);
        return "admin/category-edit";
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public String createCategory(Model model, Category category) throws RemoteException {
        Category categoryResult = categoryService.save(category);
        return "redirect:/admin/category";
    }

    @RequestMapping(value = "/category-edit/{id}", method = RequestMethod.POST)
    public String updateCategory(Model model, Category category, @PathVariable("id") int id) throws RemoteException {
        Category categoryResult = categoryService.update(id, category);
        return "redirect:/admin/category";
    }



    @RequestMapping(value = "/place", method = RequestMethod.GET)
    public String getPlace(Model model) {
        model.addAttribute("places", placeService.findAll());
        return "admin/place-list";
    }

    @RequestMapping(value = "/place-create", method = RequestMethod.GET)
    public String createPlace(Model model) {
        model.addAttribute("place", new Place());
        model.addAttribute("categories", categoryService.findAll());
        return "admin/place-form";
    }

    @RequestMapping(value = "/place-edit/{id}", method = RequestMethod.GET)
    public String editPlace(Model model, @PathVariable("id") int id) {
        Place place = placeService.findById(id);
        if (place == null) return "redirect:/admin/place";
        model.addAttribute("place", place);
        model.addAttribute("categories", categoryService.findAll());
        return "admin/place-edit";
    }

    @RequestMapping(value = "/place", method = RequestMethod.POST)
    public String storePlace(Model model, Place place) {
        User user = userService.findById(1);
        place.setUser(user);
        place.setCategory(categoryService.findById(place.getCategoryId()));
        placeService.save(place);
        return "redirect:/admin/place";
    }

    @RequestMapping(value = "/place-edit/{id}", method = RequestMethod.POST)
    public String updatePlace(Model model, Place place, @PathVariable("id") int id) {
        User user = userService.findById(1);
        place.setUser(user);
        place.setCategory(categoryService.findById(place.getCategoryId()));
        placeService.update(id, place);
        return "redirect:/admin/place";
    }

    @RequestMapping(value = "/placeimage", method = RequestMethod.GET)
    public String placeImage(Model model) {
        return "admin/placeImage-form";
    }
}
