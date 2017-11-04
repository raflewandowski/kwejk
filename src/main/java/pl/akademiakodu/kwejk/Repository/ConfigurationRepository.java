package pl.akademiakodu.kwejk.Repository;

import org.springframework.context.annotation.*;
import pl.akademiakodu.kwejk.model.Gif;

/**
 * Created by Patryk Dudzik on 04.11.2017.
 */
@Configuration
public class ConfigurationRepository {

    @Bean
    public GifsRepository gifsRepository() {
        GifsRepository gifsRepository = new GifsRepository();
        gifsRepository.addGif(new Gif(1L, "android-explosion", true));
        gifsRepository.addGif(new Gif(2L, "compiler-bot", true));
        gifsRepository.addGif(new Gif(3L, "ben-and-mike", false));
        gifsRepository.addGif(new Gif(4L, "book-dominos", false));
        gifsRepository.addGif(new Gif(5L, "cowboy-coder", false));
        gifsRepository.addGif(new Gif(6L, "infinite-andrew", false));
        return gifsRepository;
    }
}
