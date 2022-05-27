package uz.learn.learning_centre.entity;


import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;
import uz.learn.learning_centre.entity.base.BaseEntity;
import uz.learn.learning_centre.enums.AuthRole;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "auth_user")
public class AuthUser extends Auditable implements BaseEntity {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column
    private Short experienceYear;

    @Enumerated(EnumType.STRING)
    private AuthRole role;

    @Column
    private Double salary;

    @ManyToOne
    private Organization organization;

}
