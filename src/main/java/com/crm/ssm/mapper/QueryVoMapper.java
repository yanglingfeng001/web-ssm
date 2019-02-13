package com.crm.ssm.mapper;

import com.crm.ssm.pojo.Customer;
import com.crm.ssm.pojo.QueryVo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QueryVoMapper {
    /**
     * 根据queryVo分页查询数据
     *
     * @param queryVo
     * @return
     */
    List<Customer> queryCustomerByQueryVo(QueryVo queryVo);

    /**
     * 根据queryVo查询数据条数
     *
     * @param queryVo
     * @return
     */
    int queryCountByQueryVo(QueryVo queryVo);

}
