package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "attendance")
public class Attendance extends Auditable {

    @Column
    private Long studentId;

    @Column
    private Long groupId;

    @Column
    private Boolean here;

    private Long lessonId;

    @Column
    private String cause;

    private Long attendanceContainerId;

}
