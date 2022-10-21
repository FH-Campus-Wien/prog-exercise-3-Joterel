package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int days, int dayOne) {
        int counter = dayOne - 1;

        for (int i = 1; i <= 3 * (dayOne - 1); i++) {
            System.out.print(" ");
        }
        for (int ii = 1; ii <= days; ii++) {
            System.out.printf("%2d", ii);
            System.out.print(" ");
            counter++;
            if (counter == 7) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter != 0) System.out.println();
    }

    public static long[] lcg(long x0) {
        long[] number = new long[10];
        double modul = Math.pow(2, 31);
        double factor = 1103515245;
        int increment = 12345;

        for (int i = 0; i < 10; i++) {

            long x1 = ((long) factor * x0 + increment) % (long) modul;
            x0 = x1;
            number[i] = x1;
        }
        return number;
    }

    public static void guessingGame(int guessNumber) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            System.out.print("Guess number " + i + ": ");
            int x = scanner.nextInt();
            if (i == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            } else if (x == guessNumber) {
                System.out.println("You won wisenheimer!");
                break;
            } else if (x > guessNumber) {
                System.out.println("The number AI picked is lower than your guess.");
            } else {
                System.out.println("The number AI picked is higher than your guess.");
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        Random random = new Random();
        return (random.nextInt(100) + 1);
    }

    public static boolean swapArrays(int[] firstArray, int[] secondArray){
        int i;
        if(firstArray.length!=secondArray.length){
            return false;
        }
        for(i = 0; i < firstArray.length; i++)
        {
            firstArray[i] = firstArray[i] + secondArray[i];
            secondArray[i] = firstArray[i] - secondArray[i];
            firstArray[i] = firstArray[i] - secondArray[i];
        }
        System.out.print("Array1 =>   ");
        for (int element: firstArray) {
            System.out.println(element);
        }
        System.out.print("Array1 => :  ");
        for (int element: secondArray) {
            System.out.println(element);
        }

        return true;
    }


    public static String camelCase(String input){
        char[] oldText = input.toCharArray();
        StringBuilder newText = new StringBuilder();

        if(oldText[0] >= 97 && oldText[0] <= 122)
            oldText[0] -= 32;

        for(int i = 1; i < oldText.length; i++){
            if(oldText[i] >= 65 && oldText[i] <= 90){
                oldText[i] += 32;}
            else if(oldText[i] == 32){
                i++;
                if(oldText[i] >= 97 && oldText[i] <= 122){
                    oldText[i] -= 32;}
            }
        }
        for(char j : oldText){
            if(j >= 65 && j <= 90 || j >= 97 && j <= 122)
                newText.append(j);
        }
        return newText.toString();
    }


    public static int checkDigit(int[] code) {
        int firstSum = 0;
        int i;
        for (i = 0;  i < code.length; i++) {
            firstSum = firstSum + code[i] * (i+2);
        }
        int secondSum = firstSum % 11;
        int digits = 11 - secondSum;

        if (digits == 10) {
            return 0; }
        if (digits == 11) {
            return 5;
        } else
            return digits;
    }


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}