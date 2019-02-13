package com.crm.ssm.mapper;

import com.crm.ssm.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
    /**
     * 根据id查询客户
     *
     * @param id
     * @return
     */
    Customer queryCustomerById( Long id);

    /**
     * 根据id编辑客户
     *
     * @param customer
     */
    void updateCustomerById(Customer customer);


    void deleteCustomerById(Long id);

    List<String> queryCustomerByName(String cust_name);

    int addCustomer(Customer customer);
}
