package ru.chukharev.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    @NotBlank
    private String uid; //Уникальный идентификатор сообщения

    @NotBlank
    private String operationUid; //Уникальный идентификатор операции

    @NotBlank
    private String systemTime; //Время создания сообщения

    @NotBlank
    private Codes code; //Код сообщения

    @NotBlank
    private Double annualBonus; //Ежегодня премия

    @NotBlank
    private ErrorCodes errorCode; //Наименование ошибка

    @NotBlank
    private ErrorMessages errorMessage; //Сообщение об ошибке

}
