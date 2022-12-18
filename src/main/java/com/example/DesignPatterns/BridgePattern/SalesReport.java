package com.example.DesignPatterns.BridgePattern;

public class SalesReport extends Rapor {

    public SalesReport(IReportFormat reportFormat) {
        super(reportFormat);
    }
    @Override
    public String display(){
        return "Satış raporu" + super.display();
    }
}
