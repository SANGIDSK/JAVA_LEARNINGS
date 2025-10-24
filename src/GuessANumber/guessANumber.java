package GuessANumber;

import java.util.Random;
import java.util.Scanner;

public class guessANumber {
    private static Random randomNumber = new Random();
    private static int RandomNumber = randomNumber.nextInt(100) + 1;
    private static int guess = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("the number is: " + RandomNumber);
        while(guess != RandomNumber){
            System.out.println("Guess a Number from 1 to 100");
            guess = sc.nextInt();
            if(guess<RandomNumber){
                System.out.println("Guess is Too Low");
            } else if (guess>RandomNumber) {
                System.out.println("Guess is Too High");
            }
            else{
                System.out.println("That's Right");
                break;
            }
        }
    }
}
