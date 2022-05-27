package uz.learn.learning_centre.dto.lesson;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.BaseDto;

import java.time.LocalDate;


@Getter
@Setter
public class LessonCreateDto implements BaseDto {

    private Long createdBy;

    private String days;// hafta kunlari

    private Long lessonType;

    private LocalDate lessonBegin;

    private LocalDate lessonEnd;

    private Long groupId;// write relationship

}
