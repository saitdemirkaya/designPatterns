package com.example.DesignPatterns.ChainOfResponsibility;

public class Veznedar extends Employee {
    @Override
    public String ProcessRequest(Integer amount) {
        if (amount <= 50000) {
            return "Veznedar tarafından para çekme işlemi yapıldı!";
        } else {
            return this.nextApprover.ProcessRequest(amount);
        }
    }
}
