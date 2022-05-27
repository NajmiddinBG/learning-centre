package uz.learn.learning_centre.entity;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Botirov Najmiddin, Thu 8:54 PM. 5/26/2022
 */

@Getter
@Setter
@Entity
@Table(name = "results")
public class Results extends Auditable {

    @Column
    private String title;

    @Column
    private String picture;

    @Column
    private String description;

    private Long organizationId;
}
