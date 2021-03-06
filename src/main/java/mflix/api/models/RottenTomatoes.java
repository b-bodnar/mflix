package mflix.api.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class RottenTomatoes {

    private Date lastUpdated;
    private ViewerRating viewer;
}
