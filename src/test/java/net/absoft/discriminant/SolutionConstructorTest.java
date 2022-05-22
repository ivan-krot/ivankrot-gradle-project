package net.absoft.discriminant;

import net.absoft.solution.QuadraticEquation;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SolutionConstructorTest {

//    // HOME TASK START
//
//    public void soft(double ax1, double ax2, int aErrorCode, double ex1, double ex2, int eErrorCode) {
//        SoftAssert s = new SoftAssert();
//        s.assertEquals(ax1, ex1);
//        s.assertEquals(ax2, ex2);
//        s.assertEquals(aErrorCode, eErrorCode);
//        s.assertAll();
//    }
//
//    public QuadraticEquation sc = new QuadraticEquation();
//
//    @Test(description = "Test#1: D > 0")
//    public void testEquationWith2DifferentSQRT() {
//        sc.solution(1, -4, -2);
//        soft(sc.x1, sc.x2, sc.errorCode, 2 + Math.sqrt(6.0), 2 - Math.sqrt(6.0), 0);
//    }
//
//    @Test(description = "Test#2: D == 0")
//    public void testEquationWith2SameSQRT() {
//        sc.solution(1, 12, 36);
//        soft(sc.x1, sc.x2, sc.errorCode, -6.0, sc.x1, 0);
//    }
//
//    //Custom solution implemented after clarification with reviewer
//    @Test(description = "Test# 3.0 : D < 0: ERR_103: Discriminant less than ZERO: D < 0")
//    public void testEquationWithoutSQRT() {
//        sc.solution(3, -4, 2);
//        soft(sc.x1, sc.x2, sc.errorCode, 0, 0, 103);
//    }
//
//    // HOME TASK END
//
//    @Test(description = "Test# 1.1 : D > 0 (double check)")
//    public void testEquationWith2DifferentSQRT_1() {
//        sc.solution(1, 9, 18);
//        soft(sc.x1, sc.x2, sc.errorCode, -3.0, -6.0, 0);
//    }
//
//    @Test(description = "Test# 1.2 : D > 0 (with decimal sqrt)")
//    public void testEquationWith2DifferentSQRT_2() {
//        sc.solution(2, 3, -5);
//        soft(sc.x1, sc.x2, sc.errorCode, 1.0, -2.5, 0);
//    }
//
//    @Test(description = "Test# 1.3 : D > 0 (with decimal sqrt: 5/3)")
//    public void testEquationWith2DifferentSQRT_3() {
//        sc.solution(-3, 5, 0);
//        soft(sc.x1, sc.x2, sc.errorCode, -0.0, (double) 5 / 3, 0);
//    }
//
//    @Test(description = "Test# 2.1 : b == 0, c == 0: regression after implementation custom logic")
//    public void testEquationWith2SameSQRT_1() {
//        sc.solution(1, 0, 0);
//        soft(sc.x1, sc.x2, sc.errorCode, 0.0, sc.x1, 0);
//    }
//
//    @Test(description = "Test# 4.0 : a == 0, linear equation: ERR_102: Provided linear equation instead of quadratic")
//    public void testErrorForLinearEquation() {
//        sc.solution(0, 3, -5);
//        soft(sc.x1, sc.x2, sc.errorCode, 0, 0, 102);
//    }
//
//    @Test(description = "Test# 5.0 : a == 0, b == 0 incomplete: ERR_101: Incomplete quadratic equation")
//    public void testErrorForIncompleteQuadraticEquation() {
//        sc.solution(0, 0, -5);
//        soft(sc.x1, sc.x2, sc.errorCode, 0, 0, 101);
//    }
//
//    @Test(description = "Test# 5.1 : a == 0, c == 0 incomplete: ERR_101: Incomplete quadratic equation")
//    public void testErrorForIncompleteQuadraticEquation_1() {
//        sc.solution(0, -3, 0);
//        soft(sc.x1, sc.x2, sc.errorCode, 0, 0, 101);
//    }
//
//    @Test(description = "Test# 5.2 : a == 0, b == 0, c == 0 incomplete: ERR_101: Incomplete quadratic equation")
//    public void testErrorForIncompleteQuadraticEquation_2() {
//        sc.solution(0, 0, 0);
//        soft(sc.x1, sc.x2, sc.errorCode, 0, 0, 101);
//    }

}