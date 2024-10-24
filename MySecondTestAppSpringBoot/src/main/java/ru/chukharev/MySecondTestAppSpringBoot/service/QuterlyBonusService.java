package ru.chukharev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public interface QuterlyBonusService {
    double calculate(Boolean isManager, double salary, int workDays);
}
