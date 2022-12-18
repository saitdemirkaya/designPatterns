package com.example.DesignPatterns.CompositePattern;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/*
                Composite Pattern
Uygulamanızın ana modeli bir ağaç şeklinde gösterilebiliyorsa composite tasarım desenini kullanmanız işe yarayabilir.

Örneğin alışveriş sepeti oluşturulacak ve farklı türde malzemeler var. Bunların ortak özellikleri olarak ücretleri ve
renklerini düşünelim. Tek bir renkle hepsini almak isteyen kullanıcı var. Her birini tekrar oluşturmak yerine
interface ile subclass'ları birleştirip daha okunabilir bir kod oluşturabiliriz.

**/
@RestController
@RequestMapping("/composite")
@Scope("prototype")
public class CompositeRestController {

    @GetMapping("/{colorName}")
    public String getComposite(@RequestParam String colorName) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Telephone(colorName));
        productList.add(new Charger(colorName));
        productList.add(new Headphone(colorName));
        productList.add(new PhoneCase(colorName));
        productList.add(new SelfieStick(colorName));

        StringBuilder result = new StringBuilder();

        int totalPrice = 0;
        for (Product product : productList) {
            result.append(product.getColor()).append("; Price: ").append(product.price()).append("\n");
            totalPrice = totalPrice + product.price();
        }
        return result + "\nTotalPrice : " + totalPrice;
    }
}
