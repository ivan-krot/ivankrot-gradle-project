package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testUserAge() {
        AgeChecker ageChecker = new AgeChecker(); 
        ageChecker.setMinAge(13);
        Assert.assertTrue(ageChecker.isAgeCorrect(18), "User older than minimal age is not able to play");
    }

    @Test
    public void testThatTooYoungUsersCanNotPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.isAgeCorrect(17), "User under 18 is able to play !");
    }
}