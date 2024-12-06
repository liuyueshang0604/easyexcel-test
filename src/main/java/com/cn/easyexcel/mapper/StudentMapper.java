package com.cn.easyexcel.mapper;

import com.cn.easyexcel.entity.Student;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;

/**
 * @author 86166
 * @date 2024-12-06 11:06
 */
@Mapper
public interface  StudentMapper extends CommonInsertMapper<Student> {

    //@InsertProvider(type= SqlProviderAdapter.class, method="insertMultiple")
    //int insertMultiple(MultiRowInsertStatementProvider<Student> insertStatement);
}
