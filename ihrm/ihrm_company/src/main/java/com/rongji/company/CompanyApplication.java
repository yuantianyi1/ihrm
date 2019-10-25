package com.rongji.company;

import com.rongji.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @program: ihrm_parent
 * @description:启动类
 * @author: 袁天一
 * @create: 2019-10-24 15:10
 **/
@SpringBootApplication(scanBasePackages = "com.rongji.company")
@EntityScan(value = "com.rongji.domain.company")
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class,args);
    }
    @Bean
    public IdWorker idWorker(){
        return  new IdWorker();
    }
}
