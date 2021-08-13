package com.model;

public class Employee {
  int employeeId;
  String employeeName, employeeEmail, employeePassword;
  Address address;

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeEmail() {
    return employeeEmail;
  }

  public void setEmployeeEmail(String employeeEmail) {
    this.employeeEmail = employeeEmail;
  }

  public String getEmployeePassword() {
    return employeePassword;
  }

  @Override
  public String toString() {
    return "Employee [employeeId="
        + employeeId
        + ", employeeName="
        + employeeName
        + ", employeeEmail="
        + employeeEmail
        + ", employeePassword="
        + employeePassword
        + ", address="
        + address
        + "]";
  }

  public void setEmployeePassword(String employeePassword) {
    this.employeePassword = employeePassword;
  }
}
