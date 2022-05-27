package uz.learn.learning_centre.dto.speciality;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.BaseDto;
import uz.learn.learning_centre.entity.MockExam;

@Getter
@Setter
public class SpecialityCreateDto implements BaseDto {
    private MockExam mockExam;
    private Long subjectId;
    private Short answerCount;
    private boolean main;
}
