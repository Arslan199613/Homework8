import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        System.out.println();
        int[] arr1 = {1, 2, 3};

        System.out.println(Arrays.toString(arr1));

        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 10};
        System.out.println(Arrays.toString(arr3));


        //Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задание 3
        System.out.println("Задание 4");
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] % 2 != 0) {
                    arr1[i] += 1;
                }
            }
            System.out.println(Arrays.toString(arr1));
        }
    }


