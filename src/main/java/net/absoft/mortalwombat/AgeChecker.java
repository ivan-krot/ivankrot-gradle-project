package net.absoft.mortalwombat;

public class AgeChecker {
    private int minAge = 18;

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
    public boolean isAgeCorrect(int age) {
        return age >= minAge;
    }
}
