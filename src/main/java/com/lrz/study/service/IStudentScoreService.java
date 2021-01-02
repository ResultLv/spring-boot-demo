package com.lrz.study.service;

import com.lrz.study.fluent_mybatis.dto.ScoreStatistics;

import java.util.List;

/**
 * @author 01387015
 * @date 2021/1/2
 */
public interface IStudentScoreService {

    List<ScoreStatistics> queryStatistics(int fromYear, int endYear, String[] subjects);

}
