package net.absoft.discriminar;

public class SQRTCalculation {

    //Maybe it's better move Solution from SQRTCalculation ?
    public static class Solution {

        float x1, x2, error;

        public void setX1(double x1) {
            this.x1 = (float) x1;
        }

        public void setX2(double x2) {
            this.x2 = (float) x2;
        }

        public void setError(double error) {
            this.error = (float) error;
        }

        public float getX1() {
            return x1;
        }

        public float getX2() {
            return x2;
        }

        public float getError() {
            return error;
        }
    }

    public static double getDiscriminar(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static Solution getSolution(int a, int b, int c) {
        Solution solution = null;

        //Custom logic for preventing tricky cases
        if (a == 0) {
            solution = new Solution();
            if (b == 0 || c == 0) {
                System.out.println("ERR_001: Incomplete quadratic equation");
                solution.setError(1);
            } else {
                System.out.println("ERR_002: Provided linear equation instead of quadratic");
                solution.setError(2);
            }
            return solution;
        }
        double d = getDiscriminar(a, b, c);
        if (d >= 0) {
            solution = new Solution();
            solution.setX1((-b + Math.sqrt(d)) / (2 * a));
            solution.setX2((-b - Math.sqrt(d)) / (2 * a));
            return solution;
        }
        return solution;
    }
}
