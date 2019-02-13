package com.crm.ssm.service.impl;

import com.crm.ssm.mapper.QueryVoMapper;
import com.crm.ssm.pojo.Customer;
import com.crm.ssm.utils.Page;
import com.crm.ssm.pojo.QueryVo;
import com.crm.ssm.service.QueryVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryVoServiceImpl implements QueryVoService {
    @Autowired
    private QueryVoMapper customerMapper;

    public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo) {
        // 设置查询条件,从哪一条数据开始查
        queryVo.setStart((queryVo.getPage() - 1) * queryVo.getRows());

        // 查询数据结果集
        List<Customer> list = this.customerMapper.queryCustomerByQueryVo(queryVo);
        // 查询到的数据总条数
        int total = this.customerMapper.queryCountByQueryVo(queryVo);

        // 封装返回的page对象
        Page<Customer> page = new Page<>(total, queryVo.getPage(), queryVo.getRows(), list);

        return page;
    }
}
