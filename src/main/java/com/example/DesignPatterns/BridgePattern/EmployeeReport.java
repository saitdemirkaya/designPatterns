package com.example.DesignPatterns.BridgePattern;

public class EmployeeReport extends Rapor{

    public EmployeeReport(IReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public String display(){
        return "İşçi raporu" + super.display();
    }

}
