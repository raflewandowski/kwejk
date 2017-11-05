package pl.akademiakodu.kwejk.model;

import lombok.*;

/**
 * Created by Patryk Dudzik on 04.11.2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gif {
    private Long id;
    private String name;
    private boolean favorite;
}