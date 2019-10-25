package com.rongji.company.dao;

import com.rongji.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/***
 *公司接口
 */
public interface CompanyDao extends JpaRepository<Company,String>, JpaSpecificationExecutor<Company> {

}
