package uz.learn.learning_centre.validator.attendance;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.attendance.AttendanceCreateDto;
import uz.learn.learning_centre.dto.attendance.AttendanceDto;
import uz.learn.learning_centre.dto.attendance.AttendanceUpdateDto;
import uz.learn.learning_centre.entity.Attendance;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;


@Component
public class AttendanceValidator implements GenericValidator<Attendance, AttendanceDto, AttendanceCreateDto, AttendanceUpdateDto, Long> {
    @Override
    public void validOnUpdate(AttendanceUpdateDto attendanceUpdateDto) {

    }

    @Override
    public void validOnCreate(AttendanceCreateDto attendanceCreateDto) {
    }

    @Override
    public void validOnId(Long id) {

    }
}
