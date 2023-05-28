package com.example.DesignPatterns.ChainOfResponsibility;

public class BolgeSorumlusu extends Employee {
    @Override
    public String ProcessRequest(Integer amount) {
        if (amount <= 200000) {
            return "Bolge Sorumlusu tarafından para çekme işlemi yapıldı!";
        } else {
            return "Günlük para çekme limiti aşıldığı için işlem yapılamadı!";
        }
    }
}
