import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        double num1 = getNumber();
        double num2 = getNumber();
        String operation = getOperation();
        double answer = calc(num1, num2, operation);
        System.out.println("Ответ: " + answer);
    }

    public static double getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scan.hasNextInt()) {
            return scan.nextDouble();
        }
        else {
            System.out.println("Неверный ввод, попробуй еще раз: ");
            return getNumber();
        }
    }

    public static String getOperation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите требуемую операцию '+', '-', '*', '/': ");
        String operation = scan.nextLine();
        switch (operation) {
            case ("+"):
            case ("-"):
            case ("*"):
            case ("/"):
                return operation;
            default:
                System.out.println("Неверный ввод, попробуй еще раз: ");
                return getOperation();
        }
    }

    public static double calc(double num1, double num2, String operation) {
        switch (operation) {
            case ("+"):
                return plus(num1, num2);
            case ("-"):
                return minus(num1, num2);
            case ("*"):
                return multy(num1, num2);
            case ("/"):
                return dev(num1, num2);
            default:
                return Double.NaN;
        }
    }

    public static double plus(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;
    }

    public static double multy(double num1, double num2) {
        return num1 * num2;
    }

    public static double dev(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("На ноль делить нельзя.");
            return Double.NaN;
        }
    }
}
