package com.example.duedate.domain.vo;

import lombok.Data;

@Data
public class TaskVO {
    private Long taskId;
    private Long userNumber;
    private String category;
    private String task;
    private String categoryColor;
    private String taskDate;
}
