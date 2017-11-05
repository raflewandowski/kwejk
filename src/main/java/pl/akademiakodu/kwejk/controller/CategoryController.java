package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.kwejk.repository.*;

/**
 * Created by Rafal Lewandowski on 04.11.2017.
 */
@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifsRepository gifsRepository;

    @GetMapping ("/categories")
    public String categories (ModelMap modelMap){
        modelMap.addAttribute("categories", categoryRepository.categories);
        return "categories";
    }

    @GetMapping ("/category/{id}")
    public String category (@PathVariable("id") Long id, ModelMap modelMap){
        modelMap.addAttribute("category", categoryRepository.getCategory(id));
        modelMap.addAttribute("gifs", gifsRepository.getGifsByCategory(id));
        return "category";
    }
}
