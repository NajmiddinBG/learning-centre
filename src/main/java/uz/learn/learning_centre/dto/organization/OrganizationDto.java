package uz.learn.learning_centre.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.learn.learning_centre.dto.base.GenericDto;

import javax.persistence.Column;

/**
 * @author Botirov Najmiddin, Fri 11:50 PM. 5/27/2022
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto extends GenericDto {
    private String name;
    private String logo;
    private String registrationNumber;
    private String phoneNumber;
    private Boolean blocked;
}
