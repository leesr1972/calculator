package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    private int num1;
    private int num2;

    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getDifference(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getComposition(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float getDivision(float num1, float num2) {
        return num1 / num2;
    }
}
