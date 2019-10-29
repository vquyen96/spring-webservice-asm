package t1708e.webservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.webservice.client.entity.StatusEnum;
import t1708e.webservice.client.service.*;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    PlaceService placeService;

    private static List<Category> categoryList = new ArrayList<>();
    private static int incrementCategory = 1;

    private static List<Place> places = new ArrayList<>();
    private static int incrementPlace = 1;

    private static List<User> users = new ArrayList<>();
    private static int incrementUser = 1;

    public AdminController() {
        Category cate1 = new Category(incrementCategory++, "Phú Quốc");
        categoryList.add(cate1);
        categoryList.add(new Category(incrementCategory++, "Hà Nội"));
        categoryList.add(new Category(incrementCategory++, "Sapa"));
        categoryList.add(new Category(incrementCategory++, "Đà Nẵng"));
        categoryList.add(new Category(incrementCategory++, "Quy Nhơn"));
        categoryList.add(new Category(incrementCategory++, "Hoad Binhf"));

        User user1 = new User(incrementUser++,"vquyenaaa@gmail.com","", 1, StatusEnum.ACTIVE.name());
        users.add(user1);
        places.add(new Place(cate1, incrementPlace++, "Đỉnh phansipawng", "", "", user1));
        places.add(new Place(cate1, incrementPlace++, "Đỉnh Maphineg", "", "", user1));
        places.add(new Place(cate1, incrementPlace++, "Cù Lao chàm", "", "", user1));
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "admin/index";
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String getCategories(Model model) throws RemoteException {
        model.addAttribute("categories", categoryList);
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
        Category category = categoryList.get(id-1);
        if (category == null) return "admin/category-list";
        model.addAttribute("category", category);
        return "admin/category-edit";
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public String createCategory(Model model, Category category) throws RemoteException {
        category.setId(incrementCategory++);
        categoryList.add(category);
//        categoryService.save(category);
        return "redirect:/admin/category";
    }

    @RequestMapping(value = "/category-edit/{id}", method = RequestMethod.POST)
    public String updateCategory(Model model, Category category, @PathVariable("id") int id) throws RemoteException {
        category.setId(id);
        categoryList.set(id-1, category);
        return "redirect:/admin/category";
    }



    @RequestMapping(value = "/place", method = RequestMethod.GET)
    public String getPlace(Model model) {
        model.addAttribute("places", places);
        return "admin/place-list";
    }

    @RequestMapping(value = "/place-create", method = RequestMethod.GET)
    public String createPlace(Model model) {
        model.addAttribute("place", new Place());
        model.addAttribute("categories", categoryList);
        return "admin/place-form";
    }

    @RequestMapping(value = "/place-edit/{id}", method = RequestMethod.GET)
    public String editPlace(Model model, @PathVariable("id") int id) {
        System.out.println(id);
        if (places.size() < id) return "redirect:/admin/place";
        Place place = places.get(id-1);
        System.out.println(place.getCategory() != null ? place.getCategory().getName() : "Noneee");
        model.addAttribute("place", place);
        model.addAttribute("categories", categoryList);
        return "admin/place-edit";
    }

    @RequestMapping(value = "/place", method = RequestMethod.POST)
    public String storePlace(Model model, Place place) {
        place.setId(incrementPlace++);
        User user = users.get(0);
        place.setUser(user);
        place.setCategory(categoryList.get(place.getCategoryId()-1));
        places.add(place);
        return "redirect:/admin/place";
    }

    @RequestMapping(value = "/place-edit/{id}", method = RequestMethod.POST)
    public String updatePlace(Model model, Place place, @PathVariable("id") int id) {
        if (places.size() < id) return "redirect:/admin/place";
        User user = users.get(0);
        place.setUser(user);
        place.setCategory(categoryList.get(place.getCategoryId()-1));
        places.set(id-1, place);
        return "redirect:/admin/place";
    }

    @RequestMapping(value = "/placeimage", method = RequestMethod.GET)
    public String placeImage(Model model) {
        return "admin/placeImage-form";
    }

    public List<Category> getCategories() {
        return categoryList;
    }
}
