package com.rongji.company.service;

import com.rongji.common.utils.IdWorker;
import com.rongji.company.dao.CompanyDao;
import com.rongji.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @program: ihrm_parent
 * @description:
 * @author: 袁天一
 * @create: 2019-10-24 16:05
 **/
@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private IdWorker idWorker;
    /**
     * 保存企业
     */
    public void add(Company company){
        String id = idWorker.nextId()+"";
        company.setId(id);
        //激活
        company.setState(1);
        //未审核
        company.setAuditState("0");
        companyDao.save(company);

    }
    /**
     *更新企业
     */
    public void update(Company company){
        Company temp = companyDao.findById(company.getId()).get();
        temp.setCompanyPhone("456");
        temp.setCompanyAddress("天通苑");
        companyDao.save(temp);
    }
    /**
     *删除企业
     */
    public void delete(String id){
        companyDao.deleteById(id);


    }
    /**
     *根据id查询企业
     */
    public Company findByid(String id){
        Company company = companyDao.findById(id).get();
        return company;

    }
    /**
     *查询所有企业
     */
    public List<Company> findAll(){
        List<Company> companies = companyDao.findAll();
        return companies;
    }
}
