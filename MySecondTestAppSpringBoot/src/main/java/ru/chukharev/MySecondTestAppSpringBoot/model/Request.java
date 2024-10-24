package ru.chukharev.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import ru.chukharev.MySecondTestAppSpringBoot.util.Systems;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {


    @NotBlank
    @Size(min=0, max = 32)
    private String uid; //Уникальный идентификатор сообщения

    @NotBlank
    @Size(min=0, max = 32)
    private String operationUid; //Уникальный идентификатор операции

    private Systems systemName; //Имя системы отправителя

    @NotBlank
    private String systemTime; //Время создания сообщения

    private String source; //Наименование ресурса

    private Positions positions; //Должность
    private Boolean isManager; //Проверка на управленческую должность
    private Double salary; //Зарплата
    private Double bonus; //Премия
    private Integer workDays; //Количество отработанных дней за год

    @Min(1)
    @Max(100000)
    private int communicationId; //Уникальный идентификатор ресурса

    private int templateId; //Уникальный идентификатор шаблона
    private int productCode; //Код продукта
    private int smsCode; //Смс код


    @Override
    public String toString(){
        return "{"+
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", smsCode=" + smsCode +
                '}';
    }
}
