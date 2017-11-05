package pl.akademiakodu.kwejk.repository;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.*;

/**
 * Created by Patryk Dudzik on 04.11.2017.
 */
public class GifsRepository {
    List<Gif> gifs = new ArrayList<>();

    public List<Gif> getGifs() {
        return gifs;
    }

    public void addGif(Gif gif) {
        gifs.add(gif);
    }

    public List<Gif> getFavorites() {
        List<Gif> favorites = new ArrayList<>();
        gifs.stream().forEach(gif -> {
            if (gif.isFavorite()){
                favorites.add(gif);
            }
        });
        return favorites;
    }

    public List<Gif> getGifsByName (String name){
        List<Gif> gifsByName = new ArrayList<>();
        gifs.stream().forEach(gif -> {
            if (gif.getName().contains(name)){
                gifsByName.add(gif);
            }
        });
        return gifsByName;
    }

    public List<Gif> getGifsByCategory (Long id){
        List<Gif> gifsByCategory = new ArrayList<>();
        gifs.stream().forEach(gif -> {
            if (gif.getCategory().getId().equals(id)){
                gifsByCategory.add(gif);
            }
        });
        return gifsByCategory;
    }


}
