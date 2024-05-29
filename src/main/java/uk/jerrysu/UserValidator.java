package uk.jerrysu;

public class UserValidator {
    public String validateUser(String username, String password) {
        if (username != null) {
            if (password != null) {
                if (username.equals("admin") && password.equals("admin123")) {
                    return "Admin";
                } else {
                    return "User";
                }
            } else {
                return "Invalid Password";
            }
        } else {
            return "Invalid Username";
        }
    }
}
