package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Column;

@Getter
@Setter
//@Entity
//@Table(schema = "organization", name = "organization")
public class Organization extends Auditable {

    @Column(nullable = false)
    private String name;

    private String logo;

    @Column(nullable = false, unique = true)
    private String registrationNumber;


}
