package pl.akademiakodu.kwejk.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.akademiakodu.kwejk.model.Category;

/**
 * Created by Rafal Lewandowski on 04.11.2017.
 */
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




}
