package com.crm.ssm.service.impl;

import com.crm.ssm.mapper.BaseDictMapper;
import com.crm.ssm.pojo.BaseDict;
import com.crm.ssm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictMapper baseDictMapper;
    public List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode) {

        List<BaseDict> list = this.baseDictMapper.queryBaseDictByDictTypeCode(dictTypeCode);
        return list;
    }
}
