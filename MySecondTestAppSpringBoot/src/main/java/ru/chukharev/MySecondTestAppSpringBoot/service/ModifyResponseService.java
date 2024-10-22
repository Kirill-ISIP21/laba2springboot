package ru.chukharev.MySecondTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.chukharev.MySecondTestAppSpringBoot.model.Response;

@Service

public interface ModifyResponseService {
    Response modify(Response response);
}
