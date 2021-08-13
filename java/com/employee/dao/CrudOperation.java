package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Employee;

public class CrudOperation {
  public SessionFactory setConfiguration() {
    Configuration configuration = new Configuration();
    configuration.configure("/com/configfile/hibernate.cfg.xml");
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    return sessionFactory;
  }

  public void addAddress(Address address) {
    Session session = setConfiguration().openSession();
    Transaction transaction = session.beginTransaction();
    session.save(address);
    transaction.commit();
  }

  public void addEmployee(Employee employee) {
    Session session = setConfiguration().openSession();
    Transaction transaction = session.beginTransaction();
    session.save(employee);
    transaction.commit();
    System.out.println("Saved");
    session.close();
  }

  public void getEmployeesData() {
    Session session = setConfiguration().openSession();
    List<Employee> employees = (List<Employee>) session.createQuery("From Employee").list();
    for (Employee employee : employees) {
      System.out.println(employee.getEmployeeName());
      System.out.println(employee.getEmployeeEmail());
      System.out.println(employee.getEmployeePassword());
      Address address = employee.getAddress();
      System.out.println(address.getCity());
      System.out.println(address.getStreet());
    }
    session.close();
  }

  public int getEmployeeData(int id) {
    Session session = setConfiguration().openSession();
    Employee employee = (Employee) session.get(Employee.class, id);

    System.out.println(employee.toString());
    Address address = new Address();
    address = employee.getAddress();
    int addressId = address.getId();
    session.close();
    return addressId;
  }

  public void updateemployee(Employee employee, int addressId) {
    Session session = setConfiguration().openSession();
    Transaction transaction = session.beginTransaction();
    Address address = new Address();
    address = (Address) session.get(Address.class, addressId);
    employee.setAddress(address);
    session.update(employee);
    transaction.commit();
    System.out.println("Updated");
    session.close();
  }

  public void deleteEmployee(int id) {
    Session session = setConfiguration().openSession();
    Transaction transaction = session.beginTransaction();
    Employee employee = (Employee) session.get(Employee.class, id);
    session.delete(employee);
    transaction.commit();
    session.close();
  }
}
