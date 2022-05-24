package uz.learn.learning_centre.dto.student;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.enums.StudyType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentDto extends GenericDto {

    private String fullName;

    private String username;

    private StudyType studyType; // Grant / Contract / None

    private String entranceYear;

    private String mothersNumber;

    private String fathersNumber;
}
