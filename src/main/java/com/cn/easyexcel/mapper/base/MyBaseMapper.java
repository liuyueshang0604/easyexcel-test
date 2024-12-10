package com.cn.easyexcel.mapper.base;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

/**
 * @author 86166
 * @date 2024-12-09 13:46
 */
@Mapper
public interface MyBaseMapper <T> extends BaseMapper<T> {
    /**
     * 批量插入
     */
    Integer insertBatchSomeColumn(Collection<T> entityList);
}