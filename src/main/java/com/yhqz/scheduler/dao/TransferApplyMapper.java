package com.yhqz.scheduler.dao;

import com.yhqz.scheduler.model.TransferApply;

public interface TransferApplyMapper {
    int deleteByPrimaryKey(Integer rowId);

    int insert(TransferApply record);

    int insertSelective(TransferApply record);

    TransferApply selectByPrimaryKey(Integer rowId);

    int updateByPrimaryKeySelective(TransferApply record);

    int updateByPrimaryKey(TransferApply record);
}