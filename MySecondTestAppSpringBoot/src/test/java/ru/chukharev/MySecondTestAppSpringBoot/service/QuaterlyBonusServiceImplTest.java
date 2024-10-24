package ru.chukharev.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QuaterlyBonusServiceImplTest {

    @Test
    void calculate() {
        //given
        Boolean isManager = true;
        double salary = 100000.00;
        int workDays = 250;
        //when
        double bonusResult = new QuaterlyBonusServiceImpl().calculate(isManager, salary, workDays);
        //then
        double expected = 90000.00;
        assertThat(expected).isEqualTo(bonusResult);
    }
}
