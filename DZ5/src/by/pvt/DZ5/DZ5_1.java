package by.pvt.DZ5;

import java.util.Scanner;

public class DZ5_1 {

    public static void main(String[] args) {
        boolean isTrue = true;
        String arrayLength = " ";

        while (isTrue) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input array length:");
            arrayLength = in.nextLine();
            int length = 0;
            int max = 0;
            try {
                length = Integer.parseInt(arrayLength); //значение должно быть числом!
                int[] array = new int[length];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * 100);
                    System.out.print(array[i] + " ");
                }
                System.out.println(" ");
                for (int i = 1; i < array.length; i++) {
                    if (array[max] < array[i]) {
                        max = i;
                    }
                }
                System.out.println("Array max = " + array[max]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            break;
        }
    }
}

