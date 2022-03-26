package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    private int num1;
    private int num2;

    @Override
    public int getSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    @Override
    public int getDifference(int num1, int num2) {
        int dif = num1 - num2;
        return dif;
    }

    @Override
    public int getComposition(int num1, int num2) {
        int com = num1 * num2;
        return com;
    }

    @Override
    public float getDivision(int num1, int num2) {
        float div = num1 / num2;
        return div;
    }
}
