package com.example.DesignPatterns.ChainOfResponsibility;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chainOfResponsibility")
@Scope("prototype")
public class ChainOfResponsibilityRestController {

    public static final String NOT_FOUND_LEAUGE = "Not Found Leauge!";

    @GetMapping("/{amount}")
    public String calculateDistance(@PathVariable("amount") Integer amount) {

        Employee veznedar = new Veznedar();
        Employee mudur = new Mudur();
        Employee bolgeSorumlusu = new BolgeSorumlusu();

        veznedar.setNextApprover(mudur);
        mudur.setNextApprover(bolgeSorumlusu);
        return veznedar.ProcessRequest(amount);
    }

}
