package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "mock_exam")
public class MockExam extends Auditable {

    @OneToMany(mappedBy = "mockExam")
    private List<Speciality> speciality;

    private String studentName;

    private String phoneNumber;

    private Float ball;

    private Long mockId;

    private Long organizationId;
}
