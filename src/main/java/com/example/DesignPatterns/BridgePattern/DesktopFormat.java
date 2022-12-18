package com.example.DesignPatterns.BridgePattern;

public class DesktopFormat implements IReportFormat{
    @Override
    public String generate() {
        return " desktop formatında oluşturuldu";
    }
}
