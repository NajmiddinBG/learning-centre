package uz.learn.learning_centre.dto.exam;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExamDto extends GenericDto {
    private Integer ball;
    private String title;
    private Long groupId;
    private Long studentId;
    private LocalDateTime date;
}
