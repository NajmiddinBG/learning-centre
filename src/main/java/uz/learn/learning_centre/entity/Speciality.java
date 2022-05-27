package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.BaseEntity;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "speciality")
public class Speciality implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "mock_exam_speciality")
    private MockExam mockExam;

    private Long lessonTypeId;

    private Short answerCount;

    private boolean main;// asosiy or not

}
