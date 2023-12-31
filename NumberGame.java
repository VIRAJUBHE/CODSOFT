/*              NUMBER GAME
1. Generate a random number within a specified range , such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct , too high , or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:
5. Limit the number of attempts the user has a guess the number.
6. Add the option for multiple rounds , allowing the user to play again.
7. Display the user's score , which can be based on the number of attempts taken or rounds won.
 */

import java.util.Scanner;
import java.util.Random;

class NumberGame{
    public static void main(String arg[]){
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        
        int x = ran.nextInt(101);
        int attempt=0 , guess , score = 100;
        System.out.println("You have only 10 attempts to guess the Number");

        do{
            System.out.println("Enter your Guess Number = ");
            guess = sc.nextInt();
            
            if(x == guess){
                System.out.println("CONGRATULATION the guessed Number is Correct");
                System.out.println("Random Number was "+x);
                break;
            }
            else if(guess < x)
                System.out.println("Oops !!!! You Entered Wrong Number . Enter the Number which is greater than "+guess+"\n");
            else if(guess > x)
                System.out.println("Oops !!!! You Entered Wrong Number . Enter the Number which is less than "+guess+"\n");
            attempt ++;
            score -=10;
        }while(attempt<10);
        System.out.println("Your attempts were = "+attempt);
        sc.close();
        
        System.out.println("Your Score is : "+score);
    }
}