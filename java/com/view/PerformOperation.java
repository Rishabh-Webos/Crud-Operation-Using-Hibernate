package com.view;

import java.util.Scanner;

import com.employee.dao.CrudOperation;
import com.main.ClonObject;
import com.model.Address;
import com.model.Employee;

public class PerformOperation {
  public void performOperation(CrudOperation operation) {
    Address address = ClonObject.cloneAddres("amizara", "surat");
    operation.addAddress(address);
    Employee employee =
        ClonObject.cloneEmployee(
            "Rishabh", "mrrishudwivedi0705@gmail.com", "Rishabh@1234", address);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter what operation you want to perform");
    String perform = scanner.next();
    switch (perform) {
      case "insert":
        operation.addAddress(address);
        operation.addEmployee(employee);
        break;
      case "display":
        operation.getEmployeesData();
        break;
      case "update":
        int id = 3;
        int addressId = operation.getEmployeeData(id);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        employee = ClonObject.cloneEmployee(name, email, password, address);
        operation.updateemployee(employee, addressId);
        break;
      case "delete":
        int id1 = 3;
        operation.deleteEmployee(id1);
        break;
    }
    scanner.close();
  }
}
