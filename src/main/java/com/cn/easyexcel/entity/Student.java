package com.cn.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
/**
 * 学生实体类
 * lombok：通过一个插件 + 一个依赖 ，就可以在编译的时候自动帮助生成实体类常用方法
 *
 * @author liuys
 * @date 2024/12/04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    /**
     * 学号
     */
    @ExcelProperty("学号")
    private String id;

    /**
     * 学生姓名
     */
    @ExcelProperty("学生姓名")
    @ColumnWidth(20)
    private String name;

    /**
     * 学生性别
     */
    @ExcelProperty(value = "学生性别", index = 1)
    private String gender;

    /**
     * 学生出生日期
     */
    @ExcelProperty("出生日期")
    @ColumnWidth(20)
    private Date birthday;

}