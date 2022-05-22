package net.absoft.solution;

import java.util.HashMap;
import java.util.Map;

public class QuadraticEquation {

  private final int a;
  private final int b;
  private final int c;

  public QuadraticEquation(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Map<String, Object> solve() {
    Map<String, Object> solution = new HashMap<>();

    //Custom logic for preventing tricky cases
    if (a == 0) {
      if (b == 0 || c == 0) {
        System.out.println("ERR_101: Incomplete quadratic equation");
        solution.put("errorCode", 101);
        solution.put("errorMessage", "ERR_101: Incomplete quadratic equation");
      } else {
        System.out.println("ERR_102: Provided linear equation instead of quadratic");
        solution.put("errorCode", 102);
        solution.put("errorMessage", "ERR_102: Provided linear equation instead of quadratic");
      }
      return solution;
    }

    float d = getDiscriminant();
    if (d >= 0) {
      solution.put("x1", (-b + Math.sqrt(d)) / (2 * a));
      solution.put("x2", (-b - Math.sqrt(d)) / (2 * a));
    } else {
      System.out.println("ERR_103: Discriminant less than ZERO: D < 0");
      solution.put("errorCode", 103);
      solution.put("errorMessage", "ERR_103: Discriminant less than ZERO: D < 0");
    }
    return solution;
  }

  private float getDiscriminant() {
    return (float) Math.pow(b, 2) - 4 * a * c;
  }

}