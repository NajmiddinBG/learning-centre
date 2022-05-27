package uz.learn.learning_centre.entity;

import lombok.Data;
import uz.learn.learning_centre.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Data
public class Mock extends Auditable {

    @Column
    private String name;

    @Column
    private LocalDateTime date;

    private Long organizationId;
}
