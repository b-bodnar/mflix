package mflix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;

@Getter
@Setter
@NoArgsConstructor
public class Critic {

    @JsonProperty("_id")
    private String id;

    @JsonProperty("count")
    @BsonProperty("count")
    private int numComments;

    public Critic(String id, int numComments) {
        super();
        this.id = id;
        this.numComments = numComments;
    }
}
