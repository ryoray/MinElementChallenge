package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.print("How many number : ");
        count = scanner.nextInt();
        System.out.println("--------------------");
        readIntegers(count);
    }

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersEntered = new int[count];
        for (int i=0; i<numbersEntered.length; i++) {
            System.out.print("Number #" + (i+1) + " : ");
            numbersEntered[i] = scanner.nextInt();
        }

        System.out.println("--------------------");

        for (int i=0; i<numbersEntered.length; i++) {
            System.out.println("Number in array [" + i + "] = " + numbersEntered[i]);
        }
        return numbersEntered;
    }


}
