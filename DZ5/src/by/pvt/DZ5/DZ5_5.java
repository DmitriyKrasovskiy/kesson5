package by.pvt.DZ5;
/*Задание 5.5

        Создать массив с целыми числовыми значения (с помощью Math.random() метода) .
        Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.*/

public class DZ5_5 {

    public static void main(String[] args) {
        int[] array = new int [10];
        System.out.print("Массив случайных чисел: ");
        for(int i =0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //определяем макс число и его позицию
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
                indexMax = i;
            }
        }
        //определяем мин число и его позицию
        int min = array[0];
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                indexMin = i;
            }
        }

        System.out.println("Максимальное число= " + max + " " + "Индекс: " + indexMax);
        System.out.println("Минимальное число= " + min + " " + "Индекс: " + indexMin);


        //считаем сумму
        int sum = 0;
        if(indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += array[i];
            }
        }
        else{
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += array[i];
            }
        }

        if(sum == 0)
            System.out.println("Сумма = 0");
        else {
            System.out.println("The sum is: " + sum);
        }
    }
}

