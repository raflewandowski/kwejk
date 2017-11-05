package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.kwejk.repository.CategoryRepository;

/**
 * Created by Rafal Lewandowski on 04.11.2017.
 */
@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

//    @GetMapping("/categories")
//    public String categories(ModelMap modelMap) {
//        modelMap.addAttribute("categories", categoryRepository.categories);
//        return "categories";
//    }

    @GetMapping("/categories")
    public String categoriesSearchEngine(@RequestParam (required = false) String q, ModelMap modelMap) {

        if(q != null && !q.isEmpty()) {
            modelMap.addAttribute("categories", categoryRepository.findByName(q));
        } else {
            modelMap.addAttribute("categories", categoryRepository.findAll());
        }
        return "categories";
    }
}
