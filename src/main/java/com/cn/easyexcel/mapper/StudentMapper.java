package com.cn.easyexcel.mapper;

import com.cn.easyexcel.entity.Student;
import com.cn.easyexcel.mapper.base.MyBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;

/**
 * @author 86166
 * @date 2024-12-06 11:06
 */
@Mapper
public interface  StudentMapper extends MyBaseMapper<Student>,CommonInsertMapper<Student> {

    //@InsertProvider(type= SqlProviderAdapter.class, method="insertMultiple")
    //int insertMultiple(MultiRowInsertStatementProvider<Student> insertStatement);
}
