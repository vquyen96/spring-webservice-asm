package t1708e.webservice.client.serviceData;

import t1708e.webservice.client.service.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private static List<Category> categoryList = new ArrayList<>();
    private static int incrementCategory = 1;

    public void init() {
        Category cate1 = new Category(incrementCategory++, "Phú Quốc");
        categoryList.add(cate1);
        categoryList.add(new Category(incrementCategory++, "Hà Nội"));
        categoryList.add(new Category(incrementCategory++, "Sapa"));
        categoryList.add(new Category(incrementCategory++, "Đà Nẵng"));
        categoryList.add(new Category(incrementCategory++, "Quy Nhơn"));
        categoryList.add(new Category(incrementCategory++, "Hoad Binhf"));
    }

    public List<Category> findAll() {
        return categoryList;
    }

    public Category save (Category category) {
        category.setId(incrementCategory++);
        categoryList.add(category);
        return category;
    }

    public Category findById(int id) {
        if (id > categoryList.size()) {
            return null;
        }
        return categoryList.get(id-1);
    }

    public Category update(int id, Category category) {
        if (id > categoryList.size()) {
            return null;
        }
        categoryList.set(id - 1, category);
        return category;
    }

}
