package com.example.DesignPatterns.ChainOfResponsibility;

public class Mudur extends Employee {
    @Override
    public String ProcessRequest(Integer amount) {
        if (amount <= 100000) {
            return "Mudur tarafından para çekme işlemi yapıldı!";
        } else {
            return this.nextApprover.ProcessRequest(amount);
        }
    }
}
