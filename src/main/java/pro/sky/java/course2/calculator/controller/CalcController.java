package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String calcGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calcService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String showDifference(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calcService.getDifference(num1, num2);
    }

    @GetMapping("/multiply")
    public String showComposition(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calcService.getComposition(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivision (@RequestParam float num1, @RequestParam float num2) {
        return num1 + " / " + num2 + " = " + calcService.getDivision(num1, num2);
    }
}
