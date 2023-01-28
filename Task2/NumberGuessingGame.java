package Task2;

import java.util.Objects;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void guessingNumberGame(){
        Scanner vj = new Scanner(System.in);
        int num;

        {
            num = 1 + (int) (100 * Math.random());
        }
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("4 Moves are given. Try to find the Guessed Number.");
        int i,guess;
        for(i=1;i<5;i++) {
            System.out.println("Enter what you guessed");
            guess=vj.nextInt();
            if(guess<num){
                System.out.println("Guess is low...");
                System.out.println("Your attempts left = "+(4-i));

            } else if (guess>num) {
                System.out.println("Guess is high...");
                System.out.println("Your attempts left ="+ (4-i));

            }
            else{
                System.out.println("Congratulations You Guessed the Correct Number");
            }
        }
        System.out.println("No Moves Left");
        System.out.println("Number : "+num);
    }

    public static void main(String[] args) {
        guessingNumberGame();
        System.out.println("Play Again?"+ "\n Type 'Y' if Yes and 'N' if No");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        if(Objects.equals(s, "Y")){
            guessingNumberGame();
        }
        else{
            System.out.println("Thank you");
        }
    }
}