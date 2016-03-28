package com.yhqz.scheduler.dao;

import com.yhqz.scheduler.model.TransferRecord;

public interface TransferRecordMapper {
    int deleteByPrimaryKey(Integer rowId);

    int insert(TransferRecord record);

    int insertSelective(TransferRecord record);

    TransferRecord selectByPrimaryKey(Integer rowId);

    int updateByPrimaryKeySelective(TransferRecord record);

    int updateByPrimaryKey(TransferRecord record);
}