package com.example.DesignPatterns.BridgePattern;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bridge")
@Scope("prototype")
public class BridgeRestController {

    @GetMapping("/{employeeType}/{format}")
    public String getPlayerAndTeamByLeaugeName(@RequestParam("employeeType") String employeeType, @RequestParam("format") String format) {

        Rapor rapor;

        if (employeeType.equalsIgnoreCase("employee")) {
            if (format.equalsIgnoreCase("web")) {
                rapor = new EmployeeReport(new WebFormat());
            } else {
                rapor = new EmployeeReport(new DesktopFormat());
            }
        } else {
            if (format.equalsIgnoreCase("web")) {
                rapor = new SalesReport(new WebFormat());
            } else {
                rapor = new SalesReport(new DesktopFormat());
            }

        }
        return rapor.display();
    }
}
