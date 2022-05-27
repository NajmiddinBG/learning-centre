package uz.learn.learning_centre.controller.news;

import org.springframework.web.bind.annotation.*;
import uz.learn.learning_centre.controller.base.AbstractController;
import uz.learn.learning_centre.controller.base.GenericController;
import uz.learn.learning_centre.controller.base.GenericCrudController;
import uz.learn.learning_centre.criteria.lesson.LessonCriteria;
import uz.learn.learning_centre.dto.news.NewsCreateDto;
import uz.learn.learning_centre.dto.news.NewsDto;
import uz.learn.learning_centre.dto.news.NewsUpdateDto;
import uz.learn.learning_centre.response.DataDto;
import uz.learn.learning_centre.response.ResponseEntity;
import uz.learn.learning_centre.service.news.NewsService;

import java.util.List;

@RestController
@RequestMapping(value = "/news/")
public class NewsController extends AbstractController<NewsService>
        implements GenericCrudController<NewsCreateDto, NewsUpdateDto>,
        GenericController<NewsDto, LessonCriteria> {

    public NewsController(NewsService service) {
        super(service);
    }


    @Override
    public ResponseEntity<DataDto<NewsDto>> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DataDto<List<NewsDto>>> getAll(LessonCriteria criteria) {
        return null;
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
}
