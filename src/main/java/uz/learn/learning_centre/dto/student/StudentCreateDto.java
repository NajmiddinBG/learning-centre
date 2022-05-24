package uz.learn.learning_centre.dto.student;

import lombok.Data;
import uz.learn.learning_centre.dto.base.BaseDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class StudentCreateDto implements BaseDto {

    private String fullName;

    private String username;


    private String password;

    @NotBlank
    private String studyType; // Grant / Contract / None

    private String entranceYear;

    @NotBlank
    @Size(min = 9)
    private String mothersNumber;

    @NotBlank
    @Size(min = 9)
    private String fathersNumber;

}
