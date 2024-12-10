package com.cn.easyexcel.service.base;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author 86166
 * @date 2024-12-10 09:40
 */
public interface IMyService <T> extends IService<T> {
    int insertBatchSomeColumn(List<T> entityList);
    int insertBatchSomeColumn(List<T> entityList,int batchSize);
}
