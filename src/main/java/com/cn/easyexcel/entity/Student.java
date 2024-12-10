package com.cn.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName(value = "student")
public class Student extends Model {

    /**
     * 学号
     */
    @ExcelProperty("学号")
    @TableField("id")
    private String id;

    /**
     * 学生姓名
     */
    @ExcelProperty("学生姓名")
    @ColumnWidth(20)
    @TableField(fill = FieldFill.INSERT)
    private String name;

    /**
     * 学生性别
     */
    @ExcelProperty(value = "学生性别", index = 1)
    @TableField(fill = FieldFill.INSERT)
    private String gender;

    /**
     * 学生出生日期
     */
    @ExcelProperty("出生日期")
    @ColumnWidth(20)
    @TableField(fill = FieldFill.INSERT)
    private Date birthday;

}