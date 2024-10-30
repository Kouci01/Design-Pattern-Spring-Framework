package com.example.Composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements CompanyComponent{
    private String name;
    private List<CompanyComponent> componentList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addComponent(CompanyComponent component) {
        componentList.add(component);
    }

    public void removeComponent(CompanyComponent component) {
        componentList.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (CompanyComponent component : componentList) {
            component.showDetails();
        }
    }
}
