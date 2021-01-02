package com.lrz.study.fluent_mybatis.dao.intf;

import cn.org.atool.fluent.mybatis.base.IBaseDao;
import com.lrz.study.fluent_mybatis.dto.ScoreStatistics;
import com.lrz.study.fluent_mybatis.entity.StudentScore;

import java.util.List;

/**
 * TmStudentScoreDao: 数据操作接口
 *
 * 这只是一个减少手工创建的模板文件
 * 可以任意添加方法和实现, 更改作者和重定义类名
 * <p/>@author Powered By Fluent Mybatis
 */
public interface StudentScoreDao extends IBaseDao<StudentScore> {

    /**
     * 统计从fromYear到endYear年间学科subjects的统计数据
     *
     * @param fromYear 统计年份区间开始
     * @param endYear  统计年份区间结尾
     * @param subjects 统计的学科列表
     * @return 统计数据
     */
    List<ScoreStatistics> statistics(int fromYear, int endYear, String[] subjects);
}
