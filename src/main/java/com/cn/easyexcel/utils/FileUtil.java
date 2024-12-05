package com.cn.easyexcel.utils;

public class FileUtil {
    public static String getFileName(String fileName) {
        return fileName.substring(0, fileName.lastIndexOf("."));
    }
    public static String getExcelFilePath(){
        return "src/main/demo";
    }
}
