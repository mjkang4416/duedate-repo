package com.example.duedate.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class DiaryDTO {
    private long diaryId;
    private long userNumber;
    private String diaryDate;
    private String diaryTitle;
    private String diaryEmo;
    private String diaryContent;

    private Boolean status;

}
