package com.example.duedate.domain.vo;

import lombok.Data;

@Data
public class DiaryVO {
    private long diaryId;
    private long userNumber;
    private String diaryDate;
    private String diaryTitle;
    private String diaryEmo;
    private String diaryContent;
}
