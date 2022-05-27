package uz.learn.learning_centre.service.speciality;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.speciality.SpecialityCriteria;
import uz.learn.learning_centre.dto.speciality.SpecialityCreateDto;
import uz.learn.learning_centre.dto.speciality.SpecialityDto;
import uz.learn.learning_centre.dto.speciality.SpecialityUpdateDto;
import uz.learn.learning_centre.entity.Speciality;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.mapper.speciality.SpecialityMapper;
import uz.learn.learning_centre.repository.speciality.SpecialityRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.speciality.SpecialityValidator;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SpecialityService extends AbstractService<SpecialityMapper, SpecialityValidator, SpecialityRepository>
        implements GenericCrudService<SpecialityDto, SpecialityCreateDto, SpecialityUpdateDto>,
        GenericService<SpecialityDto, SpecialityCriteria> {

    public SpecialityService(SpecialityMapper mapper, SpecialityValidator validator, SpecialityRepository repository) {
        super(mapper, validator, repository);
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(SpecialityCreateDto specialityCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(SpecialityUpdateDto specialityUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<SpecialityDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<SpecialityDto>>> getAll(SpecialityCriteria criteria) {
        return null;
    }
}
