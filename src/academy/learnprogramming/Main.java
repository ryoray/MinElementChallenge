package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int count;
        System.out.print("How many number : ");
        count = scanner.nextInt();
        System.out.println("--------------------------");
        findMin(readIntegers(count));
    }

    public static int[] readIntegers(int count) {
        //Scanner scanner = new Scanner(System.in);
        int[] numbersEntered = new int[count];
        for (int i=0; i<numbersEntered.length; i++) {
            System.out.print("Number #" + (i+1) + " : ");
            numbersEntered[i] = scanner.nextInt();
        }

        System.out.println("--------------------------");

        for (int i=0; i<numbersEntered.length; i++) {
            System.out.println("Number in array [" + i + "] = " + numbersEntered[i]);
        }
        return numbersEntered;
    }

    public static void findMin(int[] array) {
        int[] arrayCheck = array;
        int minimum = arrayCheck[0];
        for (int i=0; i<arrayCheck.length; i++) {
            if (minimum > arrayCheck[i]) {
                minimum = arrayCheck[i];
            }
        }
        System.out.println("--------------------------");
        System.out.println("Minimum number : " + minimum);
    }
}
