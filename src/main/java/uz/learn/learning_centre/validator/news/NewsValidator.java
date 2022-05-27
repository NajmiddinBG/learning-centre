package uz.learn.learning_centre.validator.news;

import org.springframework.stereotype.Component;
import uz.learn.learning_centre.dto.news.NewsCreateDto;
import uz.learn.learning_centre.dto.news.NewsDto;
import uz.learn.learning_centre.dto.news.NewsUpdateDto;
import uz.learn.learning_centre.entity.News;
import uz.learn.learning_centre.exceptions.BadRequestException;
import uz.learn.learning_centre.validator.base.GenericValidator;

import java.util.Objects;

@Component
public class NewsValidator implements GenericValidator<News, NewsDto, NewsCreateDto, NewsUpdateDto, Long> {

    @Override
    public void validOnUpdate(NewsUpdateDto newsUpdateDto) {

    }

    @Override
    public void validOnCreate(NewsCreateDto newsCreateDto) {

    }

    @Override
    public void validOnId(Long id) {

    }

}
