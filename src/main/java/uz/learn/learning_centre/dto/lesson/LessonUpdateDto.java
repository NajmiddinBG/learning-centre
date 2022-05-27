package uz.learn.learning_centre.dto.lesson;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

import java.time.LocalDate;

@Getter
@Setter
public class LessonUpdateDto extends GenericDto {

    private Long createdBy;

    private String days;// hafta kunlari

    private Long lessonTypeId;

    private LocalDate lessonBegin;

    private LocalDate lessonEnd;

    private Long groupId;// write relationship

}
