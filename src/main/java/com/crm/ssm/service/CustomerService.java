package com.crm.ssm.service;

import com.crm.ssm.pojo.Customer;

import java.util.List;

public interface CustomerService {
    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    Customer queryCustomerById(Long id);

    void updateCustomerById(Customer customer);

    void deleteCustomerById(Long id);

    List<String> queryCustomerByName(String cust_name);

    boolean addcustomer(Customer customer);
}
