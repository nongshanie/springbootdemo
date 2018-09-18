package com.nongshanie.springboot.springbootdemo.dao.mapper;


import com.nongshanie.springboot.springbootdemo.dao.model.SrCredit;

public interface SrCreditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SrCredit record);

    int insertSelective(SrCredit record);

    SrCredit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SrCredit record);

    int updateByPrimaryKey(SrCredit record);
}