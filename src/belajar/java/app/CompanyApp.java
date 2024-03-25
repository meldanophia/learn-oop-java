package belajar.java.app;

import belajar.java.data.Company;

public class CompanyApp {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Melda");

        Company.Employee employee = company.new Employee();
        employee.setName("Melda belajar Java");
    }

}
