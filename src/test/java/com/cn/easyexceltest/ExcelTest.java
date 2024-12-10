package com.cn.easyexceltest;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.cn.EasyexcelTestApplication;
import com.cn.easyexcel.entity.Student;
import com.cn.easyexcel.listener.StudentListener;
import com.cn.easyexcel.service.StudentService;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 狐狸半面添
 * @create 2023-02-26 15:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EasyexcelTestApplication.class)
public class ExcelTest {

    @Autowired
    private StudentService studentService;

    /**
     * 工作簿：一个excel文件就是一个工作簿
     * 工作表：一个工作簿可以有多个工作表（sheet）
     */
    @Test
    public void test01() {
        /*
            1.获得一个工作簿对象
            构建一个读的工作簿对象，参数说明：
                - pathName：要读的文件的路径
                - head：文件中每一行数据要存储到的实体的类型的class
                - readListener：读监听器，每读一行内容，都会调用一次该对象的invoke，在invoke可以操作使用读取到的数据
         */
        ExcelReaderBuilder readWorkBook = EasyExcel.read("src/main/demo/学生信息表.xlsx", Student.class,new StudentListener(studentService));
        // 2.获得一个工作表对象，默认读取第一个工作表
        // 2.获得一个工作表对象，默认读取第一个工作表
        ExcelReaderSheetBuilder sheet = readWorkBook.sheet();
        // 3.读取工作表中的内容
        sheet.doRead();
    }
}