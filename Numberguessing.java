// uses java scanner and random to create guessing game

import java.util.Scanner;
import java.util.Random;

public class Numberguessing {


     public static void main(String[] args) {


         int number;
         Random generate = new Random();
         number = generate.nextInt(1, 10) + 1;

         int guess;
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number from 1 - 10.");
         guess = scan.nextInt();

         while (guess != number) {
             System.out.println("Your Guessed Wrong, Try Again.");
             guess = scan.nextInt();
         }
         System.out.println("Congratulations You Win!!");


     }


}