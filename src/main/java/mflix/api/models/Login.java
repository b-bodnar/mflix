package mflix.api.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class Login {

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 8)
    private String password;

    public Login(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
}
