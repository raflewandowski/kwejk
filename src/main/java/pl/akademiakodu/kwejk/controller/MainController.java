package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.Repository.GifsRepository;

/**
 * Created by Patryk Dudzik on 04.11.2017.
 */
@Controller
public class MainController {

    @Autowired
    GifsRepository gifsRepository;

    @GetMapping("/")
    public String main (ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifsRepository.getGifs());
        return "home";
    }
}
