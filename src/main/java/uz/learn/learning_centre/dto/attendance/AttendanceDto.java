package uz.learn.learning_centre.dto.attendance;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

import java.time.LocalDateTime;

@Getter
@Setter
public class AttendanceDto extends GenericDto {

    private Long studentId;

    private Long groupId;

    private Long lessonId;

    private Boolean here;// null if here / true if reasonable / false if reason not found(send message)

    private LocalDateTime createdAt;

}
