package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "grouping")
public class Grouping extends Auditable {

    @Column
    private String name;

    @Column
    private Long subjectId;

    @Column
    private Long mentorId;

    @Column
    private Boolean available; // nabor course da bormi or not

    @Column
    private LocalDate closedDate; // group tugatilgan sanasi

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_group",
            schema = "student",
            joinColumns = {@JoinColumn(name = "group_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    private List<AuthUser> students;

    @Column(nullable = false)
    private Double price;

    private Long organizationId;
}
