package Home_work_2_3;

import java.util.Scanner;
/*
  Поиск максимального элемента в массиве:
- задаем массив слов
- размерность массива произвольна, задается в консоли
- после чего в консоли вводятся слова в количестве равном заданной длине массива
- в полученном массиве необходимо найти самое длинное слово
- результат вывести на консоль
 */

public class Max_Massive {
    static Scanner sc = new Scanner(System.in);
    private static String[] createMass(int n){
        String[] Mass = new String[n];
        for (int i=0; i<n; i++){
            Mass[i] = sc.next();
        }
        sc.close();
        return Mass;
    }
    private static int searchFirstBigElement(String[] mas){
        int indexOfMaxLength=0;
        for (int i=0; i<mas.length; i++){
            if (mas[indexOfMaxLength].length() < mas[i].length()) indexOfMaxLength = i;
        }
        return indexOfMaxLength;
    }
    public static void arrayOfString() {
        System.out.printf("Задать размер массива: ");
        int lengthOfMass = sc.nextInt();
        System.out.println("Введите слова:");
        String [] mass = createMass(lengthOfMass);
        System.out.println("Самое длинное слово в данном массиве это: " + mass[searchFirstBigElement(mass)]);
    }

}
