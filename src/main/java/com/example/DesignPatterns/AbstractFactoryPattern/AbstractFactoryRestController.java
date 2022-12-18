package com.example.DesignPatterns.AbstractFactoryPattern;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/abstractFactory")
@Scope("prototype")
public class AbstractFactoryRestController {

    public static final String NOT_FOUND_LEAUGE = "Not Found Leauge!";

    @GetMapping("/{LeaugeName}")
    public String getPlayerAndTeamByLeaugeName(@PathVariable("LeaugeName") String leaugeName) {
        Optional<Football> vehicle = new LeaugeFactory().getTeamAndPlayerByName(leaugeName);
        return vehicle
                .map(football -> football.getTeam().GetTeamColor() + "\n" + football.getPlayer().GetTopScorer())
                .orElse(NOT_FOUND_LEAUGE);
    }
}
