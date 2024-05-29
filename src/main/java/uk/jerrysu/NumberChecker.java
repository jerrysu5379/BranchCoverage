package uk.jerrysu;

public class NumberChecker {
    public String checkNumber(int number) {
        if (number > 0) {
            if(number % 2 == 0) {
                return "Positive Even";
            } else {
                return "Positive Odd";
            }
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}
