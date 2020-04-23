package mflix.api.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IMDB {

    private int id;
    private int votes;
    private double rating;
}
