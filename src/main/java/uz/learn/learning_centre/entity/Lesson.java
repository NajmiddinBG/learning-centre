package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "lesson")
public class Lesson extends Auditable {

    private String days;// hafta kunlari

    private Long lessonTypeId;

    private LocalDate lessonBegin;

    private LocalDate lessonEnd;

    private Long lessonScheduleId;// write relationship
}
