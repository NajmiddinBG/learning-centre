package uz.learn.learning_centre.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Botirov Najmiddin, Fri 4:20 PM. 5/27/2022
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lesson_type")
public class LessonType extends Auditable {
    private String name;
}
