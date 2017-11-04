package pl.akademiakodu.kwejk.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Category;

import java.util.ArrayList;
import java.util.List;

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

}
