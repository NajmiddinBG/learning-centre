package uz.learn.learning_centre.criteria.authUser;

import lombok.Getter;
import lombok.Setter;
import uz.learn.learning_centre.criteria.base.AbstractCriteria;
import uz.learn.learning_centre.enums.AuthRole;

@Getter
@Setter
public class AuthUserCriteria extends AbstractCriteria {

    private AuthRole role;

//    public AuthUserCriteria(Integer size, Integer page) {
//        super(size, page);
//    }
}
