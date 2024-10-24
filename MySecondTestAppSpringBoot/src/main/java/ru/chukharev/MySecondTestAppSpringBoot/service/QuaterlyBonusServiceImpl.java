package ru.chukharev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class QuaterlyBonusServiceImpl implements QuterlyBonusService {
    @Override
    public double calculate(Boolean isManager, double salary, int workDays) {
        int workDaysAvgMonth = (int) workDays / 12;
        if (isManager) return salary * 3 * 0.3 / workDaysAvgMonth * workDaysAvgMonth;
        else return 0.0;
    }
}
