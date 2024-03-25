package belajar.java.app;

import belajar.java.data.Company;

public class CompanyApp {

    Company company = new Company();
    company.setName("Melda Nophia");

    Company.Employee employee = company.new Employee();
    employee.setName("Melda");
}
