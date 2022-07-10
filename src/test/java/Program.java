import exceptions.DivisionByZeroException;

import java.util.Scanner;

public class Program {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Введите первое число");
        double firstParam = getDoubleFromConsole();
        System.out.println("Введите второе число");
        double secondParam = getDoubleFromConsole();

        System.out.println("Выберите операцию :");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        String operationNumber = getTextFromConsole();

        try{
            Calculator calc = new Calculator();
            calc.setFirstParam(firstParam);
            calc.setSecondParam(secondParam);
            calc.doOperation(operationNumber);
            System.out.println("Результат : " + calc.getResult());
        }catch (DivisionByZeroException e){
            System.out.println("Ошибка : " + e.getMessage());
        }finally {
            scanner.close();
        }

    }

    public static double getDoubleFromConsole() {
        double result = 0.0;
        do {
            String value = scanner.next();
            if (value.matches("\\d+(.\\d+)?")) {
                result = Double.parseDouble(value);
                break;
            } else {
                System.out.println("Введенное значение не является числом. Повторите ввод.");
            }
        } while (true);
        return result;
    }

    public static String getTextFromConsole() {
        return scanner.next();
    }

}
