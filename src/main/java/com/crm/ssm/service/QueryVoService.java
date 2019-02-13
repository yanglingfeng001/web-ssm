package com.crm.ssm.service;

import com.crm.ssm.pojo.Customer;
import com.crm.ssm.utils.Page;
import com.crm.ssm.pojo.QueryVo;

public interface QueryVoService {
    /**
     * 根据条件分页查询客户
     *
     * @param queryVo
     * @return
     */
    Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);
}
