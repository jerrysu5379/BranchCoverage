package uk.jerrysu;

public class LoginValidator {
    public boolean validateLogin(String username, String password) {
        if (username != null && password != null) {
            if (!username.isEmpty() && !password.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
