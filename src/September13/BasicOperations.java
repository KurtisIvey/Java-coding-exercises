package September13;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+": {
                return addition(v1, v2);
            }
            case "-": {
                return subtraction(v1, v2);
            }
            case "*": {
                return multiplication(v1, v2);
            }
            case "/": {
                return division(v1, v2);
            }
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }
    }

    public static Integer addition(int v1, int v2) {
        return v1 + v2;
    }

    public static Integer subtraction(int v1, int v2) {
        return v1 - v2;
    }

    public static Integer multiplication(int v1, int v2) {
        return v1 * v2;
    }

    public static Integer division(int v1, int v2) {
        if (v2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return v1 / v2;
    }
}
