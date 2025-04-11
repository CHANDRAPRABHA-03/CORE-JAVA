package com.xworkz.Override.external;

import com.xworkz.Override.internal.Employee;

public class Manager extends Employee {

    public Manager() {
        System.out.println("Manager: No-arg constructor");
    }

    @Override
    public void work() {
        System.out.println("Manager is supervising the team");
    }

    public void manage(Employee employee) {
        if (employee != null) {
            System.out.println("Manager is managing the employee's tasks");
        } else {
            System.out.println("No employee to manage");
        }
    }
}
