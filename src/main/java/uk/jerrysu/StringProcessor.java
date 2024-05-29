package uk.jerrysu;

public class StringProcessor {
    public String processString(String s) {
        if (s.length() > 5) {
            if (s.contains("a")) {
                return "Long String with 'a'";
            } else {
                return "Long String without 'a'";
            }
        } else {
            if (s.contains("a")) {
                return "Short String with 'a'";
            } else {
                return "Short String without 'a'";
            }
        }
    }
}
