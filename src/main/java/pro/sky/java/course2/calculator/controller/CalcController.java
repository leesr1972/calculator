package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalcService;
import java.util.Optional;

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
    public String showSum(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2) {
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        return num1.get() + " + " + num2.get() + " = " + calcService.getSum(num1.get(), num2.get());
    }

    @GetMapping("/minus")
    public String showDifference(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2){
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        return num1.get() + " - " + num2.get() + " = " + calcService.getDifference(num1.get(), num2.get());
    }

    @GetMapping("/multiply")
    public String showComposition(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2) {
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        return num1.get() + " * " + num2.get() + " = " + calcService.getComposition(num1.get(), num2.get());
    }

    @GetMapping("/divide")
    public String showDivision (@RequestParam Optional<Float> num1, @RequestParam Optional<Float> num2) {
        if (num1.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num1.";
        }
        if (num2.isEmpty()) {
            return "Ошибка! Вы не ввели параметр num2.";
        }
        if (num2.get() == 0.0) {
            return "Деление на 0 равно бесконечности. Это очень сложно. Исправьте пожалуйста параметр num2.";
        }
        return num1.get() + " / " + num2.get() + " = " + calcService.getDivision(num1.get(), num2.get());
    }
}
