package com.example.DesignPatterns.ChainOfResponsibility;

public abstract class Employee {
    Employee nextApprover;

    public void setNextApprover(Employee nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract String ProcessRequest(Integer amount);
}
