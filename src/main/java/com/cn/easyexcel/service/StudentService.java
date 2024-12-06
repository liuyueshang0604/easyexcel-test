package com.cn.easyexcel.service;
import com.cn.easyexcel.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
/**
 * @author 狐狸半面添
 * @create 2023-02-26 16:27
 */
public interface StudentService {
    /**
     * 保存学生信息
     *
     * @param students 信息列表
     */
    void save(ArrayList<Student> students);
}