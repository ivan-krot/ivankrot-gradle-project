package net.absoft.discriminant;

public class Discriminant {

    public static float getDiscriminant(int a, int b, int c) {
        return (float) Math.pow(b, 2) - 4 * a * c;
    }
}