package com.crm.ssm.controller;

import com.crm.ssm.pojo.BaseDict;
import com.crm.ssm.pojo.Customer;
import com.crm.ssm.pojo.QueryVo;
import com.crm.ssm.service.BaseDictService;
import com.crm.ssm.service.CustomerService;
import com.crm.ssm.service.QueryVoService;
import com.crm.ssm.utils.Page;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private BaseDictService baseDictService;
    @Resource
    private CustomerService customerService;
    @Resource
    private QueryVoService queryVoService;
    @RequestMapping("/list")
    public String queryCustomerList(QueryVo queryVo, Model model, HttpSession session) {

        try {
            // 解决get请求乱码问题
            if (StringUtils.isNotBlank(queryVo.getCustName())) {
                queryVo.setCustName(new String(queryVo.getCustName().getBytes("ISO-8859-1"), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 客户来源
        List<BaseDict> fromType = this.baseDictService.queryBaseDictByDictTypeCode("002");
        // 所属行业
        List<BaseDict> industryType = this.baseDictService.queryBaseDictByDictTypeCode("001");
        // 客户级别
        List<BaseDict> levelType = this.baseDictService.queryBaseDictByDictTypeCode("006");
        // 把前端页面需要显示的数据放到模型中
        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);

        // 分页查询数据
        Page<Customer> page = this.queryVoService.queryCustomerByQueryVo(queryVo);
        // 把分页查询的结果放到模型中
        model.addAttribute("page", page);

        // 数据回显
        model.addAttribute("custName", queryVo.getCustName());
        model.addAttribute("custSource", queryVo.getCustSource());
        model.addAttribute("custIndustry", queryVo.getCustIndustry());
        model.addAttribute("custLevel", queryVo.getCustLevel());

        return "customer";
    }

    /**
     * 根据id查询用户,返回json格式数据
     *
     * @param id
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Customer queryCustomerById(@RequestParam Long id) {
        Customer customer = this.customerService.queryCustomerById(id);
        return customer;
    }
    /**
     * 根据id编辑客户
     *
     * @param customer
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public void queryCustomerById(Customer customer) {
        this.customerService.updateCustomerById(customer);
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public  Boolean AddCustomer(Customer customer)
    {
        boolean a=this.customerService.addcustomer(customer);
        return a;
    }

    /**
     * 根据id删除客户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public void deleteCustomerById(@RequestParam Long id) {
        this.customerService.deleteCustomerById(id);
    }

    /*
    * 根据姓名进行模糊查询
    *
    *
    * */
    @RequestMapping(value = "/find",method = RequestMethod.POST)
    @ResponseBody
    public List<String> getCustomerName(@RequestParam String cust_name) {
        List<String> list=this.customerService.queryCustomerByName(cust_name);
        return list;
    }

}
