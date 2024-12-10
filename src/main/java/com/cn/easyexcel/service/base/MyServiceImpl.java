package com.cn.easyexcel.service.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cn.easyexcel.mapper.base.MyBaseMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 86166
 * @date 2024-12-10 09:41
 */

public class MyServiceImpl<M extends MyBaseMapper<T>, T>extends ServiceImpl<M,T> implements IMyService<T> {
    @Override
    public int insertBatchSomeColumn(List<T> entityList) {
        return this.baseMapper.insertBatchSomeColumn(entityList);
    }

    @Override
    public int insertBatchSomeColumn(List<T> entityList, int batchSize) {
        int size=entityList.size();
        if(size<batchSize){
            return this.baseMapper.insertBatchSomeColumn(entityList);
        }
        int page=1;
        if(size % batchSize ==0){
            page=size/batchSize;
        }else {
            page=size/batchSize+1;
        }
        for (int i = 0; i < page; i++) {
            List<T> sub = new ArrayList<>();
            if(i==page-1){
                sub=entityList.subList(i*batchSize, entityList.size());
            }else {
                sub.subList(i*batchSize,(i+1)*batchSize);
            }
            if(sub.size()>0){
                baseMapper.insertBatchSomeColumn(sub);
            }

        }
        return size;
    }
}
