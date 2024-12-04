package com.cn.easyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.cn.easyexcel.entity.Student;
import com.cn.easyexcel.listener.StudentListener;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author liuys
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentListener studentListener;
    @PostMapping("/upload")
    public String readExcel(MultipartFile uploadExcel) {
        try {
            // 1.获取工作簿
            ExcelReaderBuilder readWorkBook = EasyExcel.read(uploadExcel.getInputStream(), Student.class, studentListener);
            // 2.获取工作表
            ExcelReaderSheetBuilder sheet = readWorkBook.sheet();
            // 3.读取数据
            sheet.doRead();
            // 4.释放线程
            StudentListener.threadLocal.remove();
            return "success";
        } catch (Exception e) {
            //log.error("读取文件失败：{}", e.getMessage());
            return "fail";
        }
    }

    @GetMapping("/test")
    public String test() {
        try {
            return "success";
        } catch (Exception e) {
            //log.error("读取文件失败：{}", e.getMessage());
            return "fail";
        }
    }
}