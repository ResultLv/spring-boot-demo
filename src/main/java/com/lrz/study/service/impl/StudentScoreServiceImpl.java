package com.lrz.study.service.impl;

import com.lrz.study.fluent_mybatis.dao.intf.StudentScoreDao;
import com.lrz.study.fluent_mybatis.dto.ScoreStatistics;
import com.lrz.study.service.IStudentScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 01387015
 * @date 2021/1/2
 */
@Service
@Slf4j
public class StudentScoreServiceImpl implements IStudentScoreService {

    @Autowired
    private StudentScoreDao studentScoreDao;

    @Override
    public List<ScoreStatistics> queryStatistics(int fromYear, int endYear, String[] subjects) {
        List<ScoreStatistics> statistics = studentScoreDao.statistics(fromYear, endYear, subjects);
        log.info("student score statistics={}", statistics);
        return statistics;
    }
}
