package com.example.Composite;

import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    public Department createCompanyStructure(){
        CompanyComponent employee1 = new Employee("Alice", "Developer");
        CompanyComponent employee2 = new Employee("Bob", "Developer");
        CompanyComponent employee3 = new Employee("Charlie", "Manager");

        // Composite nodes (departments)
        Department devDepartment = new Department("Development Department");
        devDepartment.addComponent(employee1);
        devDepartment.addComponent(employee2);

        Department managementDepartment = new Department("Management Department");
        managementDepartment.addComponent(employee3);

        // Higher-level department
        Department company = new Department("Company");
        company.addComponent(devDepartment);
        company.addComponent(managementDepartment);

        return company;
    }

    public void showCompanyStructure(Department company) {
        company.showDetails();
    }
}
