package com.crm.ssm.mapper;

import com.crm.ssm.pojo.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BaseDictMapper {
    /**
     * 根据类别代码查询数据
     *
     * @param dictTypeCode
     * @return
     */
    List<BaseDict>  queryBaseDictByDictTypeCode( String dictTypeCode);
}
