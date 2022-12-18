package com.example.DesignPatterns.BridgePattern;

public class Rapor {
    public IReportFormat reportFormat;

    public Rapor(IReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String display(){
        return reportFormat.generate();
    }
}
