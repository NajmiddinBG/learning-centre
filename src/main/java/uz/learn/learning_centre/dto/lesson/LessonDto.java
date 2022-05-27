package uz.learn.learning_centre.dto.lesson;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.entity.LessonType;

import java.time.LocalDate;

@Getter
@Setter
public class LessonDto extends GenericDto {

    private String days;// hafta kunlari

    private LocalDate lessonBegin;

    private LessonType lessonType;

    private LocalDate lessonEnd;

    private Long groupId;// write relationship

}
