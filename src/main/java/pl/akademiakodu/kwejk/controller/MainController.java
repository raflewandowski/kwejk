package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.kwejk.repository.GifsRepository;

/**
 * Created by Patryk Dudzik on 04.11.2017.
 */
@Controller
public class MainController {

    @Autowired
    GifsRepository gifsRepository;

    @GetMapping("/")
    public String mains (@RequestParam(required = false) String q, ModelMap modelMap) {
        if (q != null && !q.isEmpty()) { //apache
            modelMap.addAttribute("gifs", gifsRepository.getGifsByName(q));
        } else {
            modelMap.addAttribute("gifs", gifsRepository.getGifs());
        }
        return "home";
    }
}
