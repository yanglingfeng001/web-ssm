package com.crm.ssm.service.impl;

import com.crm.ssm.mapper.CustomerMapper;
import com.crm.ssm.pojo.Customer;
import com.crm.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;

    public Customer queryCustomerById(Long id) {
        Customer customer = this.customerMapper.queryCustomerById(id);
        return customer;
    }

    public void updateCustomerById(Customer customer) {
        this.customerMapper.updateCustomerById(customer);
    }

    public void deleteCustomerById(Long id)
    {
        this.customerMapper.deleteCustomerById(id);
    }

    @Override
    public List<String> queryCustomerByName(String cust_name) {
        List<String> list=this.customerMapper.queryCustomerByName(cust_name);
        List<String>  newList=new ArrayList<String>();//更新去重后的新list，无重名
        Set set = new HashSet();
        for (String cd:list) {
            if(set.add(cd)){
                newList.add(cd);
            }
        }
        return newList;
    }

    @Override
    public boolean addcustomer(Customer customer) {
        int result=this.customerMapper.addCustomer(customer);
        if(result==1)
        return true;
        else
            return false;
    }

}
