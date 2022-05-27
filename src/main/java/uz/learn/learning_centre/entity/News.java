package uz.learn.learning_centre.entity;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "news")
public class News extends Auditable {

    private String title;

    @OneToOne
    private Picture picture;

    @Column
    private String description;

    @Column
    private Long organizationId;

}
