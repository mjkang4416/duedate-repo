package com.example.duedate.service;

import com.example.duedate.domain.dto.DiaryDTO;
import com.example.duedate.domain.vo.DiaryVO;
import com.example.duedate.mapper.DiaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiaryServiceImpl implements DiaryService {

    private final DiaryMapper diaryMapper;




    @Override
    @Transactional
    public void insertDiary(DiaryVO diaryVO) {
        Long diaryId = diaryMapper.getSeq();
        diaryVO.setDiaryId(diaryId);
        diaryMapper.insertDiary(diaryVO);
    }

    @Override
    public DiaryVO selectDiary(long diaryId) {
        return diaryMapper.selectDiary(diaryId);
    }

    @Override
    @Transactional
    public void updateDiary(DiaryVO diaryVO) {
        diaryMapper.updateDiary(diaryVO);
    }

    @Override
    public DiaryVO selectDiaryDetail(long diaryId) {

        return diaryMapper.selectDiaryDetail(diaryId);
    }

    @Override
    public void deleteDiary(Long diaryId) {
        diaryMapper.deleteDiary(diaryId);
    }

    @Override
    public List<DiaryDTO> selectEmoAll() {
        return diaryMapper.selectEmoAll();
    }
}
