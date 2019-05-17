package by.pvt.DZ5;

import java.util.Scanner;

public class DZ5_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Число не натуральное");
                System.exit(0);
            }
        }
        System.out.println("Число натуральное");
    }
}
