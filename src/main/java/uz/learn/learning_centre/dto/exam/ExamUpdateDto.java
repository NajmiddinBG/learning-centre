package uz.learn.learning_centre.dto.exam;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExamUpdateDto extends GenericDto {
    private Integer ball;
    private String title;
    private LocalDateTime date;
}
