package mflix.api.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Movie extends AbstractMovie {

    private int year;
    private List<String> cast;
    private String plog;
    private String fullPlot;
    private Date lastUpdated;
    private String type;
    private String poster;
    private List<String> directors;
    private List<String> writers;
    private IMDB imdb;
    private List<String> countries;
    private List<String> genres;
    private RottenTomatoes tomatoes;
    private List<Comment> comments;
}
