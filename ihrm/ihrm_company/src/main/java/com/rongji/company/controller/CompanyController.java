package com.rongji.company.controller;

import com.rongji.common.enity.Result;
import com.rongji.common.enity.ResultCode;
import com.rongji.company.service.CompanyService;
import com.rongji.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: ihrm_parent
 * @description:
 * @author: 袁天一
 * @create: 2019-10-24 16:35
 **/
@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @RequestMapping(value ="",method = RequestMethod.POST)
    public Result add(@RequestBody Company company){
        companyService.add(company);
        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value = "id") String id ,@RequestBody Company company){
        company.setId(id);
        companyService.update(company);
        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value = "id") String id ){
        companyService.delete(id);
        return new Result(ResultCode.SUCCESS);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findByid(@PathVariable(value = "id") String id){
        Company company = companyService.findByid(id);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(company);
        return result;
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Result findAll(){
        List<Company> companyList = companyService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(companyList);
        return result;
    }
}
