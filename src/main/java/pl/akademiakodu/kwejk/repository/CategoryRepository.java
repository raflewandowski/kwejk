package pl.akademiakodu.kwejk.repository;

import pl.akademiakodu.kwejk.model.Category;

import java.util.*;

/**
 * Created by Rafal Lewandowski on 04.11.2017.
 */
public class CategoryRepository {

    public List<Category> categories = new ArrayList<>();

    public void addCategory (Category category){
        categories.add(category);
    }

    public List<Category> findAll(){
        return categories;
    }

    public List<Category> findByName (String name){
        List<Category> categoryList = new ArrayList<>();
        for (Category category : categories){
            if (category.getName().contains(name)){
                categoryList.add(category);
            }
        }return categoryList;

    public Category getCategory (Long id) {
        for (Category category : categories) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Category with this id doesn't exist");
    }
}
