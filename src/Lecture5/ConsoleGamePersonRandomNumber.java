package Lecture5;

import java.util.Scanner;

public class ConsoleGamePersonRandomNumber {
    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int midrange = Math.round(min + max) / 2;
        String strInput = " ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 100. The computer will guess your hidden number!");
        int personCreateNumber = scanner.nextInt();
        strInput = scanner.nextLine();
        while (!strInput.equals("0")) {
            System.out.println("Your number greater than, less than or equal to " + midrange + "?");
            System.out.println("Enter '1' if your number is bigger. Enter '2' if number is smaller. And enter '0' if computer guessed your number!");
            strInput = scanner.nextLine();
            if (strInput.equals("0")) {
                System.out.println("The computer guessed your hidden number! Guessed number is " + midrange);
                break;
            } else if (strInput.equals("1")) {
                min = midrange;
                midrange = Math.round((min + max) / 2);

                if (min == midrange && midrange != 100) {
                    midrange += 1;
                }
            } else if (strInput.equals("2")) {
                max = midrange;
                midrange = Math.round((min + max) / 2);
            }
        }
    }
}