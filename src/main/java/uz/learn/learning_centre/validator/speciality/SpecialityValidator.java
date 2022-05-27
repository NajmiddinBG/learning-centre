package uz.learn.learning_centre.validator.speciality;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.speciality.SpecialityCreateDto;
import uz.learn.learning_centre.dto.speciality.SpecialityDto;
import uz.learn.learning_centre.dto.speciality.SpecialityUpdateDto;
import uz.learn.learning_centre.entity.Speciality;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;
@Component
public class SpecialityValidator implements
        GenericValidator<Speciality, SpecialityDto, SpecialityCreateDto, SpecialityUpdateDto, Long> {
    @Override
    public void validOnUpdate(SpecialityUpdateDto specialityUpdateDto) {

    }

    @Override
    public void validOnCreate(SpecialityCreateDto specialityCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }
}
