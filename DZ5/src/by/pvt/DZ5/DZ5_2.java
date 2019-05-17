package by.pvt.DZ5;
// определяем сумму цифр числа

import java.util.Scanner;

public class DZ5_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String num = in.nextLine();
        char[] number = num.toCharArray();
        int sum = 0;

        if (number[0] == '-') {
            for (int i = 1; i < number.length; i++) {
                if(!(number[i] == '.')) {
                    sum += Integer.parseInt(Character.toString(number[i]));
                }
            }
        } else{
            for (int i = 0; i < number.length; i++) {
                if(!(number[i] == '.')) {
                    sum += Integer.parseInt(Character.toString(number[i]));
                }
            }
        }


        System.out.println("Сумма= " + sum);
    }
}




