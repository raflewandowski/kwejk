package pl.akademiakodu.kwejk.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by Rafal Lewandowski on 04.11.2017.
 */

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category {

    private Long id;
    private String name;

}
