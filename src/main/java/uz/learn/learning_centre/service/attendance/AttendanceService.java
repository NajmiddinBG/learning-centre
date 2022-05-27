package uz.learn.learning_centre.service.attendance;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.attendance.AttendanceCriteria;
import uz.learn.learning_centre.dto.attendance.AttendanceCreateDto;
import uz.learn.learning_centre.dto.attendance.AttendanceDto;
import uz.learn.learning_centre.dto.attendance.AttendanceUpdateDto;
import uz.learn.learning_centre.entity.Attendance;
import uz.learn.learning_centre.entity.AttendanceContainer;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.mapper.attendance.AttendanceMapper;
import uz.learn.learning_centre.repository.attendance.AttendanceContainerRepository;
import uz.learn.learning_centre.repository.attendance.AttendanceRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.attendance.AttendanceValidator;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService extends AbstractService<AttendanceMapper, AttendanceValidator, AttendanceRepository>
        implements GenericCrudService<AttendanceDto, AttendanceCreateDto, AttendanceUpdateDto>,
        GenericService<AttendanceDto, AttendanceCriteria> {

    private final AttendanceContainerRepository containerRepository;

    public AttendanceService(AttendanceMapper mapper, AttendanceValidator validator, AttendanceRepository repository, AttendanceRepository attendanceRepository, AttendanceContainerRepository containerRepository) {
        super(mapper, validator, repository);
        this.containerRepository = containerRepository;
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(AttendanceCreateDto attendanceCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(AttendanceUpdateDto attendanceUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<AttendanceDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<AttendanceDto>>> getAll(AttendanceCriteria criteria) {
        return null;
    }
}
