package uz.learn.learning_centre.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import uz.learn.learning_centre.entity.base.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "attendance_container")
public class AttendanceContainer implements BaseEntity {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "TIMESTAMP default NOW()")
    private LocalDate createdAt;

    private Long groupId;

//    @Column(columnDefinition = "boolean default false")
//    private boolean enabled;//

}
