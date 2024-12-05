package com.cn.easyexcel.dao;

import com.cn.easyexcel.entity.DemoData;

import java.util.List;

public class DemoDataDAO {
    public void save(List<DemoData> list) {
        // 如果是mybatis,尽量别直接调用多次insert,自己写一个mapper里面新增一个方法batchInsert,所有数据一次性插入
    }
}
