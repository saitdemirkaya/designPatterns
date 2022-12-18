package com.example.DesignPatterns.BridgePattern;

public class WebFormat implements IReportFormat{
    @Override
    public String generate() {
        return " web formatında oluşturuldu";
    }
}
