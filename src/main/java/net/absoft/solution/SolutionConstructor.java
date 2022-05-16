package net.absoft.solution;

import net.absoft.discriminant.Discriminant;

public class SolutionConstructor {
    public double d;
    public double x1;
    public double x2;
    public int errorCode;
    public String errorMessage;

    public SolutionConstructor solution(int a, int b, int c) {

        //Custom logic for preventing tricky cases
        if (a == 0) {
            if (b == 0 || c == 0) {
                System.out.println("ERR_101: Incomplete quadratic equation");
                this.errorCode = 101;
                this.errorMessage = "ERR_101: Incomplete quadratic equation";
            } else {
                System.out.println("ERR_102: Provided linear equation instead of quadratic");
                this.errorCode = 102;
                this.errorMessage = "ERR_102: Provided linear equation instead of quadratic";
            }
            return null;
        }

        this.d = Discriminant.getDiscriminant(a, b, c);
        if (d >= 0) {
            this.x1 = (-b + Math.sqrt(d)) / (2 * a);
            this.x2 = (-b - Math.sqrt(d)) / (2 * a);
        } else {
            System.out.println("ERR_103: Discriminant less than ZERO: D < 0");
            this.errorCode = 103;
            this.errorMessage = "ERR_103: Discriminant less than ZERO: D < 0";
            return null;
        }
        return this;
    }

    public double getDiscriminant() {
        return d;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

}