package com.lrz.study.controller;

import com.lrz.study.fluent_mybatis.dto.ScoreStatistics;
import com.lrz.study.service.IStudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 01387015
 * @date 2021/1/2
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private IStudentScoreService studentScoreService;

    @GetMapping("queryStatistics")
    public List<ScoreStatistics> queryStatistics(){
        int fromYear = 2000;
        int endYear = 2019;
        String[] subjects = new String[]{"语文", "数学", "英语"};
        return studentScoreService.queryStatistics(fromYear, endYear, subjects);
    }
}
