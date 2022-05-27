package uz.learn.learning_centre.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.BaseDto;
import uz.learn.learning_centre.enums.AuthRole;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserCreateDto implements BaseDto {

    private String fullName;

    private String phoneNumber;

    private String password;

    private AuthRole role;

    private Double salary = (double) 0L;
}
