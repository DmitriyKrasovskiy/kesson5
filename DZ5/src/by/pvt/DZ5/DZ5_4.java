package by.pvt.DZ5;

import java.util.Scanner;

public class DZ5_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n1 = readNumber(scanner,"Введите число ");
        char[] charArray = n1.toCharArray();
        int m=charArray.length%3;
        int k=0;

        if (m == 0) {
            for (int i =0; i <charArray.length; i++) {

                if (k % 3 == 0 && k != 0) {
                    System.out.print(" ");
                }
                System.out.print(charArray[i]);
                k += 1;
            }
        }else{
            for(int i=0; i<m;i++) {
                System.out.print(charArray[i]);
            }

            System.out.print(" ");

            for (int i=m;i<charArray.length;i++) {
                if (k % 3 == 0 && k != 0) {
                    System.out.print(" ");
                }
                System.out.print(charArray[i]);
                k += 1;
            }
        }
    }

    private static String readNumber (Scanner scanner, String message){
        int n=0;
        do {
            System.out.println(message);
            String n1 = scanner.nextLine();
                   n = Integer.parseInt(n1);

            if (n <= 0) {
                System.out.println("Номер должен быть больше ноля");
            }else{
                return n1;
            }
        } while (true);
    }
}

