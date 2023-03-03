import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println(" ");

    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        //System.out.println(Arrays.toString(arr));

        //min
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }


        //max
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println(" ");

    }

    public static void task3 (){
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();

        float sum = 0f;
        for (int j : arr) {
            sum = sum + j;
        }
        sum = sum / 30;
        //System.out.println(Arrays.toString(arr));
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
        System.out.println(" ");
    }
}