package com.cn.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.cn.easyexcel.entity.Student;
import com.cn.easyexcel.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * 读取文档的监听器类
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentListener extends AnalysisEventListener<Student> {

    private  final StudentService studentService;
    public static final ThreadLocal<ArrayList<Student>> threadLocal = new ThreadLocal<ArrayList<Student>>();


    /**
     * 读监听器，每读一行内容，都会调用一次invoke，在invoke可以操作使用读取到的数据
     *
     * @param student         每次读取到的数据封装的对象
     * @param analysisContext
     */
    public void invoke(Student student, AnalysisContext analysisContext) {
        ArrayList<Student> students = threadLocal.get();
        if (students == null) {
            threadLocal.set(new ArrayList<Student>());
            students = threadLocal.get();
        }
        students.add(student);
        if (CollectionUtils.isNotEmpty(students)) {
            studentService.save(students);
            students.clear();
        }
    }
    /**
     * 读取完整个文档之后，调用的方法
     *
     * @param analysisContext
     */
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        // todo
    }
}