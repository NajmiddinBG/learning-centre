package uz.learn.learning_centre.validator.base;

import uz.learn.learning_centre.dto.base.BaseDto;
import uz.learn.learning_centre.dto.base.GenericDto;
import uz.learn.learning_centre.entity.base.BaseEntity;

import java.io.Serializable;

public interface GenericValidator<
        E extends BaseEntity,
        D extends GenericDto,
        CD extends BaseDto,
        UD extends GenericDto,
        I extends Serializable> extends BaseValidator {


    void validOnUpdate(UD ud);

    void validOnCreate(CD cd);

    void validOnId(I id);


}
