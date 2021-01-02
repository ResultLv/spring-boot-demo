package com.lrz.study.fluent_mybatis;

import cn.org.atool.generator.FileGenerator;
import cn.org.atool.generator.annotation.Table;
import cn.org.atool.generator.annotation.Tables;

/**
 * @author 01387015
 * @date 2021/1/2
 */
public class EntityGeneratorDemo {

    public static final String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";

    public static void main(String[] args) throws Exception {
        FileGenerator.build(Empty.class);
    }
    @Tables(
            // 设置数据库连接信息
            url = url, username = "root", password = "123456",
            // 设置entity类生成src目录, 相对于 user.dir
            srcDir = "src/main/java",
            // 设置entity类的package值
            basePack = "com.lrz.study.fluent_mybatis",
            // 设置dao接口和实现的src目录, 相对于 user.dir
            daoDir = "src/main/java",
            // 要去除的表前缀
            tablePrefix = {"tm", "tt"},
            // 设置哪些表要生成Entity文件
            tables = {@Table(value = {"tm_student_score"})}
    )
    static class Empty {
    }
}