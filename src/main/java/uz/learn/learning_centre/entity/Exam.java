package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "exam")
public class Exam extends Auditable {

    @Column
    private Integer ball;

    @Column
    private LocalDateTime date;

    @Column
    private String title; // qanaqa imtihonligi

    @Column
    private Long groupId;

    @Column
    private Long studentId;

}
