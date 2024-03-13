package com.example.unittestforjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestForJavaApplicationTests {

    @Test
    @DisplayName("10 + 10 = 20")
    public void Test_AddMethod() {
        BasicMaths bm = new BasicMaths();
        double res = bm.Add(10, 10);
        Assertions.assertEquals(res, 20);
    }

    @Test
    @DisplayName("10 - 10 = 0")
    public void Test_SubstractMethod() {
        BasicMaths bm = new BasicMaths();
        double res = bm.Substract(10, 10);
        Assertions.assertEquals(res, 0);
    }

    @Test
    @DisplayName("10 / 5 = 2")
    public void Test_DivideMethod() {
        BasicMaths bm = new BasicMaths();
        double res = bm.divide(10, 5);
        Assertions.assertEquals(res, 2);
    }

    @Test
    @DisplayName("10 * 10 = 100")
    public void Test_MultiplyMethod() {
        BasicMaths bm = new BasicMaths();
        double res = bm.Multiply(10, 10);
        Assertions.assertEquals(res, 100);
    }
}
