package Lecture5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConsoleGameComputerRandomNumber {
    public static void main(String[] args) {

        int computerRandomNumber = (int) (Math.random() * 100 + 1);
        System.out.println("The computer guessed the number!");
        System.out.println("You have 7 attempts to guess the number!");

        System.out.println("Please enter a number from 0 to 100!");

        for (int i = 1; i < 8; i++) {
            System.out.println("This is your attempt nr. " + i + ".");

            Scanner scanner = new Scanner(System.in);
            int scannedNumber = scanner.nextInt();

            if (scannedNumber > computerRandomNumber) {
                System.out.println("Your number is greater than the computer guessed!");
            } else if (scannedNumber < computerRandomNumber) {
                System.out.println("Your number is smaller than the computer guessed!");
            } else {
                System.out.println("You won!!!");
            }
        }

        System.out.println("\nGame over!");
        System.out.println("Computer guessed: " + computerRandomNumber);
    }
}

