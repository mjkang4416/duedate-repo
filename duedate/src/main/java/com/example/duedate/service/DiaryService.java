package com.example.duedate.service;

import com.example.duedate.domain.dto.DiaryDTO;
import com.example.duedate.domain.vo.DiaryVO;

import java.util.List;

public interface DiaryService {

    void insertDiary(DiaryVO diaryVO);

    DiaryVO selectDiary(long diaryId);

    //일기 수정
    void updateDiary(DiaryVO diaryVO);

    //일기장 상세보기
    DiaryVO selectDiaryDetail(long diaryId);

    //    일기 삭제
    void deleteDiary(Long diaryId);

    //    이모티콘 불러오기
    List<DiaryDTO> selectEmoAll();
}
