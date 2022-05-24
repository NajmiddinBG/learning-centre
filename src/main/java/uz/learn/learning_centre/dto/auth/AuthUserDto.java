package uz.learn.learning_centre.dto.auth;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;
//import uz.learn.learning_centre.dto.subject.SubjectDto;
import uz.learn.learning_centre.enums.AuthRole;

@Getter
@Setter
public class AuthUserDto extends GenericDto {
    private String fullName;
    private String username;
    private Short experienceYear;
    private AuthRole role;
    private Double salary;
}
