package mflix.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Comment {

    @Setter(AccessLevel.NONE)
    @JsonProperty("_id")
    @BsonIgnore
    private String id;

    @BsonId
    @JsonIgnore
    private ObjectId oid;

    private String text;

    private Date date;

    private String email;

    private String name;

    @Setter(AccessLevel.NONE)
    @JsonProperty("movie_id")
    @BsonIgnore
    private String movieId;

    @Setter(AccessLevel.NONE)
    @BsonProperty("movie_id")
    @JsonIgnore
    private ObjectId movieObjectId;

    public void setId(String id) {
        this.id = id;
        this.oid = new ObjectId(id);
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
        this.movieObjectId = new ObjectId(movieId);
    }

    public void setOid(ObjectId oid) {
        this.oid = oid;
        this.id = oid.toHexString();
    }

    public void setMovieObjectId(ObjectId movieObjectId) {
        this.movieObjectId = movieObjectId;
        this.movieId = movieObjectId.toHexString();
    }
}
