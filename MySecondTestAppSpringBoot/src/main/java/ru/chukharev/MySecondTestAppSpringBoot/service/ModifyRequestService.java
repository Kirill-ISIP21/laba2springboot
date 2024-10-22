package ru.chukharev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.chukharev.MySecondTestAppSpringBoot.model.Request;
@Service
public interface ModifyRequestService {
    void modify(Request request);
}
