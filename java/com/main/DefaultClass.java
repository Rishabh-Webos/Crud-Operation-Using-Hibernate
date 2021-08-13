package com.main;

import com.employee.dao.CrudOperation;
import com.view.PerformOperation;

public class DefaultClass {
  public static void main(String[] args) {
    CrudOperation operation = new CrudOperation();
    PerformOperation view = new PerformOperation();
    view.performOperation(operation);
  }
}
