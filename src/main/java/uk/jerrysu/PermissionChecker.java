package uk.jerrysu;

public class PermissionChecker {
    public String checkPermission(String role, boolean isLogin) {
        if (isLogin) {
            if (role.equals("admin")) {
                return "Access Granted";
            } else {
                return "Limited Access";
            }
        } else {
            return "Access Denied";
        }
    }
}
