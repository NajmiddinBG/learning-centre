package uz.learn.learning_centre.dto.speciality;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

@Getter
@Setter
public class SpecialityUpdateDto extends GenericDto {
    private Long subjectId;
    private Short answerCount;
    private boolean main;
}
