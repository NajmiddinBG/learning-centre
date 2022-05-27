package uz.learn.learning_centre.service.news;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.learn.learning_centre.criteria.base.AbstractCriteria;
import uz.learn.learning_centre.dto.news.NewsCreateDto;
import uz.learn.learning_centre.dto.news.NewsDto;
import uz.learn.learning_centre.dto.news.NewsUpdateDto;
import uz.learn.learning_centre.entity.News;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.mapper.news.NewsMapper;
import uz.learn.learning_centre.repository.news.NewsRepository;
import uz.learn.learning_centre.response.AppErrorDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.base.AbstractService;
import uz.learn.learning_centre.service.base.GenericCrudService;
import uz.learn.learning_centre.service.base.GenericService;
import uz.learn.learning_centre.validator.news.NewsValidator;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService extends AbstractService<NewsMapper, NewsValidator, NewsRepository>
        implements GenericCrudService<NewsDto, NewsCreateDto, NewsUpdateDto>,
        GenericService<NewsDto, AbstractCriteria> {


    public NewsService(NewsMapper mapper, NewsValidator validator, NewsRepository repository) {
        super(mapper, validator, repository);
    }


    @Override
    public ResponseEntity<DataDto<Long>> create(NewsCreateDto newsCreateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Long>> update(NewsUpdateDto newsUpdateDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<Boolean>> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<NewsDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<NewsDto>>> getAll(AbstractCriteria criteria) {
        return null;
    }
}
