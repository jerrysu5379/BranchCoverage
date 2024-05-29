package uk.jerrysu;

public class DiscountEligibilityChecker {
    public boolean isEligibleForDiscount(int age, boolean hasMembership) {
        if (age >= 65) {
            return true;
        } else if (age < 18) {
            return true;
        } else if (hasMembership) {
            return true;
        } else {
            return false;
        }
    }
}
