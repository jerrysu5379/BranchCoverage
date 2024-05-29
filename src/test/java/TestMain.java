import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uk.jerrysu.*;

class AgeCheckerTest {
    AgeChecker checker = new AgeChecker();

    @Test
    void testVerifyAge() {
        assertEquals("Minor", checker.verifyAge(17));
        assertEquals("Adult", checker.verifyAge(18));
        assertEquals("Adult", checker.verifyAge(64));
        assertEquals("Senior Citizen", checker.verifyAge(65));
    }
}

class PermissionCheckerTest {
    PermissionChecker checker = new PermissionChecker();

    @Test
    void testCheckPermission() {
        assertEquals("Access Denied", checker.checkPermission("user", false));
        assertEquals("Access Granted", checker.checkPermission("admin", true));
        assertEquals("Limited Access", checker.checkPermission("user", true));
    }
}

class DiscountEligibilityCheckerTest {
    DiscountEligibilityChecker checker = new DiscountEligibilityChecker();

    @Test
    void testIsEligibleForDiscount() {
        // Test cases where age >= 65
        assertTrue(checker.isEligibleForDiscount(65, false));
        assertTrue(checker.isEligibleForDiscount(70, false));

        // Test cases where age < 18
        assertTrue(checker.isEligibleForDiscount(17, false));
        assertTrue(checker.isEligibleForDiscount(10, false));

        // Test cases where hasMembership is true
        assertTrue(checker.isEligibleForDiscount(30, true));
        assertTrue(checker.isEligibleForDiscount(50, true));

        // Test cases where age is between 18 and 65 and hasMembership is false
        assertFalse(checker.isEligibleForDiscount(30, false));
        assertFalse(checker.isEligibleForDiscount(50, false));
    }
}

class DiscountCalculatorTest {
    DiscountCalculator calculator = new DiscountCalculator();

    @Test
    void testCalculateDiscount() {
        // Test cases for totalAmount > 100
        assertEquals(80.00800000000001, calculator.calculateDiscount(100.01, true), 0.0001);
        assertEquals(90.009, calculator.calculateDiscount(100.01, false), 0.0001);

        // Test cases for totalAmount <= 100
        assertEquals(95.0, calculator.calculateDiscount(100, true), 0.0001);
        assertEquals(100.0, calculator.calculateDiscount(100, false), 0.0001);
    }
}

class StringProcessorTest {
    StringProcessor processor = new StringProcessor();

    @Test
    void testProcessString() {
        // Test cases for strings longer than 5 characters
        assertEquals("Long String with 'a'", processor.processString("abcdef"));
        assertEquals("Long String without 'a'", processor.processString("bcdefg"));

        // Test cases for strings 5 characters or shorter
        assertEquals("Short String with 'a'", processor.processString("abc"));
        assertEquals("Short String without 'a'", processor.processString("bcdef"));
    }
}

class SignCheckerTest {
    SignChecker checker = new SignChecker();

    @Test
    void testEvaluate() {
        assertEquals("Same sign", checker.evaluate(1, 2));
        assertEquals("Same sign", checker.evaluate(-1, -2));
        assertEquals("Zero", checker.evaluate(0, 2));
        assertEquals("Different sign", checker.evaluate(1, -2));
    }
}

class NumberCheckerTest {
    NumberChecker checker = new NumberChecker();

    @Test
    void testCheckNumber() {
        assertEquals("Positive Even", checker.checkNumber(2));
        assertEquals("Positive Odd", checker.checkNumber(1));
        assertEquals("Negative", checker.checkNumber(-1));
        assertEquals("Zero", checker.checkNumber(0));
    }
}

class DiscountCheckerTest {
    DiscountChecker checker = new DiscountChecker();

    @Test
    void testCheckDiscount() {
        assertEquals("20% Discount", checker.checkDiscount(true, true));
        assertEquals("10% Discount", checker.checkDiscount(true, false));
        assertEquals("10% Discount", checker.checkDiscount(false, true));
        assertEquals("No Discount", checker.checkDiscount(false, false));
    }
}

class UserValidatorTest {
    UserValidator validator = new UserValidator();

    @Test
    void testValidateUser() {
        assertEquals("Invalid Username", validator.validateUser(null, "password"));
        assertEquals("Invalid Password", validator.validateUser("username", null));
        assertEquals("Admin", validator.validateUser("admin", "admin123"));
        assertEquals("User", validator.validateUser("user", "password"));
    }
}

class LoginValidatorTest {
    LoginValidator validator = new LoginValidator();

    @Test
    void testValidateLogin() {
        // Test cases where both username and password are not null and not empty
        assertTrue(validator.validateLogin("user", "password"));
        assertTrue(validator.validateLogin("admin", "admin123"));

        // Test cases where username or password are null
        assertFalse(validator.validateLogin(null, "password"));
        assertFalse(validator.validateLogin("user", null));
        assertFalse(validator.validateLogin(null, null));

        // Test cases where username or password are empty
        assertFalse(validator.validateLogin("", "password"));
        assertFalse(validator.validateLogin("user", ""));
        assertFalse(validator.validateLogin("", ""));
    }
}

class PointsCalculatorTest {
    PointsCalculator calculator = new PointsCalculator();

    @Test
    void testCalculatePoints() {
        // Test cases where purchases > 0
        assertEquals(15, calculator.calculatePoints(1, 5));  // purchases > 0 and reviews <= 5
        assertEquals(30, calculator.calculatePoints(1, 6));  // purchases > 0 and reviews > 5

        // Test cases where purchases <= 0
        assertEquals(5, calculator.calculatePoints(0, 1));  // purchases <= 0 and reviews > 0
        assertEquals(0, calculator.calculatePoints(0, 0));  // purchases <= 0 and reviews <= 0

        // Additional test cases
        assertEquals(15, calculator.calculatePoints(1, 0));  // purchases > 0 and reviews = 0
        assertEquals(15, calculator.calculatePoints(5, 0));  // purchases > 0 and reviews = 0
        assertEquals(5, calculator.calculatePoints(0, 2));   // purchases = 0 and reviews > 0
        assertEquals(0, calculator.calculatePoints(0, -1));  // purchases = 0 and reviews <= 0
    }
}

class SumCalculatorTest {
    SumCalculator calculator = new SumCalculator();

    @Test
    void testCalculateSum() {
        assertEquals(0, calculator.calculateSum(new int[]{}));
        assertEquals(6, calculator.calculateSum(new int[]{1, 2, 3}));
        assertEquals(10, calculator.calculateSum(new int[]{1, 2, 3, 4}));
    }
}

class DivisionCalculatorTest {
    DivisionCalculator calculator = new DivisionCalculator();

    @Test
    void testDivide() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        assertEquals(2.0, calculator.divide(4, 2));
    }
}

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        assertEquals(2, calculator.divide(4, 2));
    }
}