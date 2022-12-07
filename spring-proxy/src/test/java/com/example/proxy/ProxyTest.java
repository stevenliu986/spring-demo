package com.example.proxy;

import org.junit.Test;

/**
 * ClassName: ProxyTest
 * Package: com.example.proxy
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 7/12/2022
 */
public class ProxyTest {

    @Test
    public void test(){
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1,2);
    }
}
