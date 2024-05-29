package uk.jerrysu;

public class PurchaseEligibilityChecker {
    public String checkEligibility(int age, boolean hasMembership) {
        if (age >= 18 && hasMembership) {
            return "Eligible";
        } else if (age >= 18 || hasMembership) {
            return "Conditionally Eligible";
        } else {
            return "Not Eligible";
        }
    }
}
