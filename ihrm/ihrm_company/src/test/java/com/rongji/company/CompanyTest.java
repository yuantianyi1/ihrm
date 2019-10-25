package com.rongji.company;

import com.rongji.company.dao.CompanyDao;
import com.rongji.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: ihrm_parent
 * @description:
 * @author: 袁天一
 * @create: 2019-10-24 15:48
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyTest {
    @Autowired
    CompanyDao companyDao;
    @Test
    public void test (){
        companyDao.save(new Company());
        Company company = companyDao.findById("1").get();
        System.out.println(company.toString());

    }

}
