package uz.learn.learning_centre.controller.base;

import lombok.RequiredArgsConstructor;
import uz.learn.learning_centre.service.base.BaseService;

@RequiredArgsConstructor
public abstract class AbstractController<S extends BaseService> implements BaseController {

    protected final S service;

}
