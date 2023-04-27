import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[1] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }


        System.out.println(floatData());
        System.out.println(prog2());
        System.out.println(stroka());
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static float floatData() {
        try {


                System.out.println("\n Введите число с запятой:  ");
                Scanner scan = new Scanner(System.in);
                float n = scan.nextFloat();
            while (true) {
                if (n%1 == 0){
                    System.out.println("\n Введите число с запятой:  ");
                Scanner scan1 = new Scanner(System.in);
                float n1 = scan1.nextFloat();}
                else if ( n%1 == 0)
                    System.out.println("Вы ввели:  " + (n));
                return n;
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        return 0;
    }

    public static int prog2() {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 0;
            double catchRes1 = intArray[8] / d;
            System.out.println("catchRes1 = " + catchRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        return 0;
    }

    public static String stroka() {
        System.out.println("\n Введите текст:  ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.isEmpty())
            throw new IllegalArgumentException("Пустые строки не вводить!!!");
//            System.out.println("Вы ввели:  "+ (str));
        return str;

    }

}