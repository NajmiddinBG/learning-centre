package uz.learn.learning_centre.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

import javax.persistence.Column;

/**
 * @author Botirov Najmiddin, Fri 11:49 PM. 5/27/2022
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationUpdateDto extends GenericDto {

    private String name;

    private String logo;

    private String phoneNumber;

    private Boolean blocked;
}
