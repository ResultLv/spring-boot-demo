package com.lrz.study.fluent_mybatis.dao.impl;

import com.lrz.study.fluent_mybatis.dao.base.StudentScoreBaseDao;
import com.lrz.study.fluent_mybatis.dao.intf.StudentScoreDao;
import com.lrz.study.fluent_mybatis.dto.ScoreStatistics;
import com.lrz.study.fluent_mybatis.wrapper.StudentScoreQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TmStudentScoreDaoImpl: 数据操作接口实现
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
@Repository
public class StudentScoreDaoImpl extends StudentScoreBaseDao implements StudentScoreDao {

    /**
     * 实现如下SQL
     * select school_term, subject, count(score), min(score), max(score), avg(score)
     * from student_score
     * where school_term between 2000 and 2019
     *   and subject in ('英语', '数学', '语文')
     *   and is_deleted = 0
     * group by school_term, subject
     * order by school_term, subject
     *
     * @param fromYear 统计年份区间开始
     * @param endYear  统计年份区间结尾
     * @param subjects 统计的学科列表
     * @return
     */
    @Override
    public List<ScoreStatistics> statistics(int fromYear, int endYear, String[] subjects) {
        StudentScoreQuery query = mapper.query()
                .select.schoolTerm().subject()
                .count("count")
                .min.score("minScore")
                .max.score("maxScore")
                .avg.score("avgScore").end()
                .where.schoolTerm().between(fromYear, endYear)
                .subject().in(subjects).end()
                .groupBy.schoolTerm().subject().end()
                .orderBy.schoolTerm().asc().subject().asc().end();
        return super.listPoJos(ScoreStatistics.class, query);
    }
}
