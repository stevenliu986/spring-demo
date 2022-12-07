package com.example.proxy;

/**
 * ClassName: CalculatorImpl
 * Package: com.example.proxy
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 7/12/2022
 */
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("方法内部，result=" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("方法内部，result=" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("方法内部，result=" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("方法内部，result=" + result);
        return result;
    }
}
