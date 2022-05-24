package uz.learn.learning_centre.dto.auth;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.enums.AuthRole;

import java.util.List;

@Getter
@Setter
public class AuthUserUpdateDto extends GenericDto {
    private String fullName;

    private String username;

    private String password;

    private Short experienceYear;

    private AuthRole role;

    private Double salary;
}
