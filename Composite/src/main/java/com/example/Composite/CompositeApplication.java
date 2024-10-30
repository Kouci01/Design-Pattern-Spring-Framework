package com.example.Composite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication implements CommandLineRunner {

    @Autowired
    private CompanyService companyService;

    public static void main(String[] args) {
        SpringApplication.run(CompositeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Department company = companyService.createCompanyStructure();
        companyService.showCompanyStructure(company);
    }
}
