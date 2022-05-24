package uz.learn.learning_centre.service.base;


import lombok.RequiredArgsConstructor;
import uz.learn.learning_centre.mapper.base.BaseMapper;
import uz.learn.learning_centre.repository.base.BaseRepository;
import uz.learn.learning_centre.validator.base.BaseValidator;

@RequiredArgsConstructor
public abstract class AbstractService<M extends BaseMapper, V extends BaseValidator, R extends BaseRepository> implements BaseService {

    protected final M mapper;
    protected final V validator;
    protected final R repository;

}
