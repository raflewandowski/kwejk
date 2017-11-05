package pl.akademiakodu.kwejk.repository;

import org.springframework.context.annotation.*;
import pl.akademiakodu.kwejk.model.*;

@Configuration
public class ConfigurationRepository {

    @Bean
    public CategoryRepository categoryRepository (){
        CategoryRepository categoryRepository = new CategoryRepository();
        categoryRepository.addCategory(new Category(1L, "mems"));
        categoryRepository.addCategory(new Category(2L, "android"));
        categoryRepository.addCategory(new Category(3L, "sport"));
        categoryRepository.addCategory(new Category(4L, "funny"));
        return categoryRepository;
    }

    @Bean
    public GifsRepository gifsRepository() {
        GifsRepository gifsRepository = new GifsRepository();
        gifsRepository.addGif(new Gif(1L, "android-explosion", true, categoryRepository().getCategory(1L)));
        gifsRepository.addGif(new Gif(2L, "compiler-bot", true, categoryRepository().getCategory(4L)));
        gifsRepository.addGif(new Gif(3L, "ben-and-mike", false, categoryRepository().getCategory(3L)));
        gifsRepository.addGif(new Gif(4L, "book-dominos", false, categoryRepository().getCategory(3L)));
        gifsRepository.addGif(new Gif(5L, "cowboy-coder", false, categoryRepository().getCategory(2L)));
        gifsRepository.addGif(new Gif(6L, "infinite-andrew", false, categoryRepository().getCategory(2L)));
        return gifsRepository;
    }
}
