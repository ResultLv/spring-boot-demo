package com.lrz.study.fluent_mybatis.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 01387015
 * @date 2021/1/2
 */
@Data
public class ScoreStatistics {

    private int schoolTerm;

    private String subject;

    private long count;

    private Integer minScore;

    private Integer maxScore;

    private BigDecimal avgScore;
}
