package uz.learn.learning_centre.controller.attendance;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.attendance.AttendanceCriteria;
import uz.learn.learning_centre.dto.attendance.AttendanceCreateDto;
import uz.learn.learning_centre.dto.attendance.AttendanceDto;
import uz.learn.learning_centre.dto.attendance.AttendanceUpdateDto;
import uz.learn.learning_centre.entity.AttendanceContainer;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.attendance.AttendanceService;

import java.util.List;

@RestController
@RequestMapping(value = "/attendance/")
public class AttendanceController extends AbstractController<AttendanceService>
        implements GenericCrudController<AttendanceCreateDto, AttendanceUpdateDto>,
        GenericController<AttendanceDto, AttendanceCriteria> {


    public AttendanceController(AttendanceService service) {
        super(service);
    }


    @Override
    public ResponseEntity<DataDto<AttendanceDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<AttendanceDto>>> getAll(AttendanceCriteria criteria) {
        return null;
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
}
