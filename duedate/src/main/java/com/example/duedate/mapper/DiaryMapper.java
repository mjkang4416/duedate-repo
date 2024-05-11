package com.example.duedate.mapper;

import com.example.duedate.domain.dto.DiaryDTO;
import com.example.duedate.domain.vo.DiaryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiaryMapper {

    Long getSeq();

//    일기 작성
    void insertDiary(DiaryVO diaryVO);

    DiaryVO selectDiary(Long diaryId);

//    일기 수정
    void updateDiary(DiaryVO diaryVO);

//    일기 상세 보기
    DiaryVO selectDiaryDetail(long diaryId);

//    일기 삭제
    void deleteDiary(Long diaryId);

//    이모티콘 불러오기
    List<DiaryDTO> selectEmoAll();
}
