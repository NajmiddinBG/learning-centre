package uz.learn.learning_centre.dto.mockExam;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.BaseDto;
import uz.learn.learning_centre.entity.Speciality;

import java.util.List;

@Getter
@Setter
@Builder
//@NoArgsConstructor
public class MockExamCreateDto implements BaseDto {

    private String name;
    /**
     * Bu Mock Exam create bo'lganda home pagega elon chiqishi uchun
     */

    private List<Speciality> speciality;

    private String studentName;

    private String phoneNumber;

    private Long mockId;

}
