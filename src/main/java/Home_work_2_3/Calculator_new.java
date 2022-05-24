package Home_work_2_3;

/*
  Реализовать операции сложения, вычитания, умножения и деления для калькулятора из предыдущего задания
 */

import java.util.Scanner;

public class Calculator_new{
    public static void calculating() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        float first = scanner.nextFloat();
        System.out.printf("Введите второе число: ");
        float second = scanner.nextFloat();

        System.out.printf("Выберите операцию (+,-,*,/): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("Sum: %.4f\n", addition(first, second));
                break;
            case '-':
                System.out.printf("Div: %.4f\n", subtraction(first, second));
                break;
            case '*':
                System.out.printf("Mult: %.4f\n", multiplication(first, second));
                break;
            case '/':
                System.out.printf("Quot: %.4f\n", division(first, second));
                break;
        }
        scanner.close();

    }

    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат сложения
     */

    private static float addition (float a, float b){
        return a + b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат вычитания
     */
    private static float subtraction (float a, float b) {
        return a - b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат умножения
     */
    private static float multiplication (float a, float b){
        return a * b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат деления
     */
    private static float division (float a, float b){
        return a / b;
    }

}

