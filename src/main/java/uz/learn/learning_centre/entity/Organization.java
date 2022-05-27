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
@Table(name = "organizations")
public class Organization extends Auditable {

    @Column(nullable = false)
    private String name;

    private String logo;

    @Column(nullable = false, unique = true)
    private String registrationNumber;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column
    private Boolean blocked;

}
