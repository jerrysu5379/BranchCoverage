package uk.jerrysu;

public class AgeChecker {
    public String verifyAge(int age) {
        if (age >= 18) {
            if (age >= 65) {
                return "Senior Citizen";
            } else {
                return "Adult";
            }
        }
        else return "Minor";
    }
}
