package com.main;

import com.model.Address;
import com.model.Employee;

public class ClonObject {
  public static Employee cloneEmployee(
      String employeenName, String employeeEmail, String employeePassword, Address address) {
    Employee employee = new Employee();
    employee.setEmployeeName(employeenName);
    employee.setEmployeeEmail(employeeEmail);
    employee.setEmployeePassword(employeePassword);
    employee.setAddress(address);
    return employee;
  }

  public static Employee cloneEmployee(
      int id,
      String employeenName,
      String employeeEmail,
      String employeePassword,
      Address address) {
    Employee employee = new Employee();
    employee.setEmployeeName(employeenName);
    employee.setEmployeeEmail(employeeEmail);
    employee.setEmployeePassword(employeePassword);
    employee.setAddress(address);
    return employee;
  }

  public static Address cloneAddres(String street, String city) {
    Address address = new Address();
    address.setCity(city);
    address.setStreet(street);
    return address;
  }
}
