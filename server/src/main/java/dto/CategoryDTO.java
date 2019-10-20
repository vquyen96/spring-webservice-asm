package dto;

import entity.Category;
import entity.StatusEnum;
import util.ObjectUtil;

public class CategoryDTO {
    private int id;
    private String name;
    private String status;

    public CategoryDTO(){}

    public CategoryDTO(String name){
        this.name = name;
        this.status = StatusEnum.ACTIVE.name();
    }

    public CategoryDTO(Category category){
        this.name = category.getName();
        this.status = category.getStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
