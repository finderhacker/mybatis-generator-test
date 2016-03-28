package com.yhqz.scheduler.dao;

import com.yhqz.scheduler.model.BidRepayRecord;

public interface BidRepayRecordMapper {
    int deleteByPrimaryKey(Integer f01);

    int insert(BidRepayRecord record);

    int insertSelective(BidRepayRecord record);

    BidRepayRecord selectByPrimaryKey(Integer f01);

    int updateByPrimaryKeySelective(BidRepayRecord record);

    int updateByPrimaryKey(BidRepayRecord record);
}