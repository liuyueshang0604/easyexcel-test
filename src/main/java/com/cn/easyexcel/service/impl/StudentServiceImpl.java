package com.cn.easyexcel.service.impl;

import com.cn.easyexcel.entity.Student;
import com.cn.easyexcel.mapper.StudentMapper;
import com.cn.easyexcel.service.StudentService;
import com.cn.easyexcel.utils.InsertConsumer;
import lombok.RequiredArgsConstructor;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;

import static org.mybatis.dynamic.sql.SqlBuilder.insertMultiple;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMyMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(ArrayList<Student> students) {
        StudentRecord record = new StudentRecord();
        //第一种写法
        /*MultiRowInsertStatementProvider<Student> multiRowInsert  = insertMultiple(students)
                .into(record)
                .map(record.id).toProperty("id")
                .map(record.name).toProperty("name")
                .map(record.gender).toProperty("gender")
                .map(record.birthday).toProperty("birthday")
                .build().render(RenderingStrategies.MYBATIS3);
            int rows = studentMapper.insertMultiple(multiRowInsert);
            */
        //第二种写法 mybatis-plus
        //myBaseMapper.insertBatchSomeColumn(students);

        System.out.println("save to database = " + students);
    }

    private static final class StudentRecord extends SqlTable{
        public final SqlColumn<String> id = column("id");
        public final SqlColumn<String> name = column("name");
        public final SqlColumn<String> gender = column("gender");
        public final SqlColumn<Date> birthday = column("birth_date");
        public StudentRecord() {
            super("student");
        }
    }
}
