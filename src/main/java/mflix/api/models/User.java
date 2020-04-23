package mflix.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private String name;
    private String email;
    @JsonIgnore
    private String hashedpw;
    private boolean isAdmin;
    private Map<String, String> preferences;

    /**
     * Checks for user object is emptiness.
     *
     * @return if no email set, the user is empty.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return this.email == null || "".equals(this.getEmail());
    }
}
