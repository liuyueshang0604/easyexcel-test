package com.cn.easyexcel.mapper.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * mp 扩展批量插入 mysql 真正的批量插入
 *
 * @Author zimingl
 * @Date 2023/4/22 2:31
 * @Description: EasyBaseMapper
 */
public interface EasyBaseMapper<T> extends BaseMapper<T> {
    /**
     * 批量插入 仅适用于mysql
     * @param entityList 实体列表
     * @return 影响行数
     */
    Integer insertBatchSomeColumn(List<T> entityList);
}
