package uz.learn.learning_centre.dto.speciality;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.entity.MockExam;

@Getter
@Setter
public class SpecialityDto extends GenericDto {
    private MockExam mockExam;
    private Long subjectId;
    private Short answerCount;
    private boolean main;
}
