package Home_work_2_3;
import java.util.Scanner;

/*
 Программа должна выполнять одно из заданий на выбор.
- Если в консоли ввести 1 - запуститься выполнение калькулятора
- Если в консоли ввести 2 - поиск максимального слова в массиве
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Вырбрать операцию \n" + "1 - Калькулятор \n" + "2 - Поиск максимального слова в массиве \n");

        int selection = scan.nextInt();
        switch (selection){
            case 1: Calculator_new.calculating();
                break;
            case 2: Max_Massive.arrayOfString();
                break;
            default:
                System.out.println("Операция не выбрана");
        }

    }

}