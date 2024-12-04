package com.cn.easyexcel.service;

import com.cn.easyexcel.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void save(ArrayList<Student> students) {
        System.out.println("save to database = " + students);
    }
}
