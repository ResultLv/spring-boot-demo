package com.lrz.study.fluent_mybatis.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.IEntity;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * StudentScoreEntity: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@FluentMybatis(
    table = "tm_student_score"
)
public class StudentScore extends RichEntity {
  private static final long serialVersionUID = 1L;

  /**
   * 主键ID
   */
  @TableId("id")
  private Long id;

  /**
   * 性别, 0:女; 1:男
   */
  @TableField("gender_man")
  private Integer genderMan;

  /**
   * 记录创建时间
   */
  @TableField("gmt_create")
  private Date gmtCreate;

  /**
   * 记录最后修改时间
   */
  @TableField("gmt_modified")
  private Date gmtModified;

  /**
   * 逻辑删除标识
   */
  @TableField("is_deleted")
  private Integer isDeleted;

  /**
   * 学期
   */
  @TableField("school_term")
  private Integer schoolTerm;

  /**
   * 成绩
   */
  @TableField("score")
  private Integer score;

  /**
   * 学号
   */
  @TableField("student_id")
  private Long studentId;

  /**
   * 学科
   */
  @TableField("subject")
  private String subject;

  @Override
  public Serializable findPk() {
    return this.id;
  }

  @Override
  public final Class<? extends IEntity> entityClass() {
    return StudentScore.class;
  }
}
