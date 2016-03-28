package com.yhqz.scheduler.dao;

import com.yhqz.scheduler.model.BidCreditRecord;

public interface BidCreditRecordMapper {
    int deleteByPrimaryKey(Integer f01);

    int insert(BidCreditRecord record);

    int insertSelective(BidCreditRecord record);

    BidCreditRecord selectByPrimaryKey(Integer f01);

    int updateByPrimaryKeySelective(BidCreditRecord record);

    int updateByPrimaryKey(BidCreditRecord record);
}