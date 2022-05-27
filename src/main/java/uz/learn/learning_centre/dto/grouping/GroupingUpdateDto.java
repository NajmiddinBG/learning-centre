package uz.learn.learning_centre.dto.grouping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupingUpdateDto extends GenericDto {

    private String name;

    private Long subject;

    private Long mentor;

    private Boolean available;

    private LocalDate closedDate;

    private Double price;

}
