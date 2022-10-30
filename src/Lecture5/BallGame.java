package Lecture5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BallGame {
    public static void main(String[] args) {
        int[] board = {1, 1, 1};
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);
        board[randomNumber] = 0;
        System.out.println(Arrays.toString(board));
        System.out.println("Please enter number from 1-3 ");
        Scanner scanner = new Scanner(System.in);
        int personGuess = scanner.nextInt();
//        System.out.println(personGuess);
        if (randomNumber == personGuess - 1) {
            System.out.println("You won!");
            System.out.println(Arrays.toString(board));
        } else {
            System.out.println("You lost!");
        }
    }
}
