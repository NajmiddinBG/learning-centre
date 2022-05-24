package uz.learn.learning_centre.dto.auth;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginDto {

    private String username;

    private String password;
}
