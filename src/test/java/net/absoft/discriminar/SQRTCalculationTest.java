package net.absoft.discriminar;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SQRTCalculationTest {

    // HOME TASK START

    @Test
    @Description("Test#1: D < 0")
    public void testEquationWith2DifferentSQRT () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(1,-4,-5);
        Assert.assertEquals(s.getX1(), 5.0);
        Assert.assertEquals(s.getX2(), -1.0);
    }

    @Test
    @Description("Test#2: D == 0")
    public void testEquationWith2SameSQRT () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(1,12,36);
        Assert.assertEquals(s.getX1(), -6.0);
        Assert.assertEquals(s.getX1(), s.getX2());
    }

    @Test
    @Description("Test# 3.0 : D < 0")
    public void testEquationWithoutSQRT () {
        Assert.assertNull(SQRTCalculation.getSolution(3, -4, 2));
    }

    // HOME TASK END

    @Test
    @Description("Test# 1.1 : D > 0 (double check)")
    public void testEquationWith2DifferentSQRT_1 () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(1,9,18);
        Assert.assertEquals(s.getX1(), -3.0);
        Assert.assertEquals(s.getX2(), -6.0);
    }

    @Test
    @Description("Test# 1.2 : D > 0 (with decimal sqrt)")
    public void testEquationWith2DifferentSQRT_2 () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(2,3,-5);
        Assert.assertEquals(s.getX1(), 1.0);
        Assert.assertEquals(s.getX2(), -2.5);
    }

    @Test
    @Description("Test# 1.3 : D > 0 (with decimal sqrt: 5/3)")
    public void testEquationWith2DifferentSQRT_3 () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(-3,5,0);
        Assert.assertEquals(s.getX1(), 0.0);
        Assert.assertEquals(s.getX2(), (float) 5/3);
    }

    @Test
    @Description("Test# 2.1 : b == 0, c == 0: regression after implementation custom logic")
    public void testEquationWith2SameSQRT_1 () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(1,0,0);
        Assert.assertEquals(s.getX1(), 0.0);
        Assert.assertEquals(s.getX1(), s.getX2());
    }

    @Test
    @Description("Test# 4.0 : a == 0, linear equation: ERR_002: Provided linear equation instead of quadratic")
    public void testErrorForLinearEquation () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(0,3,-5);
        Assert.assertEquals(s.getError(), 2);
    }

    @Test
    @Description("Test# 5.0 : a == 0, b == 0 incomplete: ERR_001: Incomplete quadratic equation")
    public void testErrorForIncompleteQuadraticEquation () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(0,0,-5);
        Assert.assertEquals(s.getError(), 1);
    }

    @Test
    @Description("Test# 5.1 : a == 0, c == 0 incomplete: ERR_001: Incomplete quadratic equation")
    public void testErrorForIncompleteQuadraticEquation_1 () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(0,-3,0);
        Assert.assertEquals(s.getError(), 1);
    }

    @Test
    @Description("Test# 5.2 : a == 0, b == 0, c == 0 incomplete: ERR_001: Incomplete quadratic equation")
    public void testErrorForIncompleteQuadraticEquation_2 () {
        SQRTCalculation.Solution s = SQRTCalculation.getSolution(0,0,0);
        Assert.assertEquals(s.getError(), 1);
    }

}
