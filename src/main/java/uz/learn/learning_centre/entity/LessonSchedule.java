package uz.learn.learning_centre.entity;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.*;
import java.util.List;

/**
 * @author Botirov Najmiddin, Thu 9:05 PM. 5/26/2022
 */

@Getter
@Setter
@Entity
@Table(name = "lesson_schedule")
public class LessonSchedule extends Auditable {


    @OneToOne
    private Grouping grouping;

    @ManyToMany
    private List<Lesson> lesson;

}
