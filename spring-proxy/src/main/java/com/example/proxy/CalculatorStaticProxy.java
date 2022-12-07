package com.example.proxy;

/**
 * ClassName: CalculatorStaticProxy
 * Package: com.example.proxy
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 7/12/2022
 */
public class CalculatorStaticProxy implements Calculator{

    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("...");
        int result = target.add(i,j);
        System.out.println("...");
        return result;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
