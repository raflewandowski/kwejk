package pl.akademiakodu.kwejk.repository;

import pl.akademiakodu.kwejk.model.Category;

import java.util.*;

/**
 * Created by Rafal Lewandowski on 04.11.2017.
 */
public class CategoryRepository {

    public List<Category> categories = new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    public void addCategory (Category category){
        categories.add(category);
    }

    public List<Category> showAllCategory(){
        return categories;
    }

    public Category getCategory (Long id) {
        for (Category category : categories) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Category with this id doesn't exist");
    }

}
