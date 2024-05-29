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

class DiscountCalculatorTest {
    DiscountCalculator calculator = new DiscountCalculator();

    @Test
    void testCalculateDiscount() {
        assertEquals(95.0, calculator.calculateDiscount(100, true));
        assertEquals(100.0, calculator.calculateDiscount(100, false));
        assertEquals(80.0, calculator.calculateDiscount(100.01, true));
        assertEquals(90.0, calculator.calculateDiscount(100.01, false));
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

class PointsCalculatorTest {
    PointsCalculator calculator = new PointsCalculator();

    @Test
    void testCalculatePoints() {
        assertEquals(0, calculator.calculatePoints(0, 0));
        assertEquals(10, calculator.calculatePoints(1, 0));
        assertEquals(15, calculator.calculatePoints(1, 5));
        assertEquals(30, calculator.calculatePoints(1, 6));
        assertEquals(5, calculator.calculatePoints(0, 1));
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