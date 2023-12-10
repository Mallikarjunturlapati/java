import java.util.*;
class Game
{
 public static void main(String[] args) 
{
Scanner a = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 10) + 1; 
int attempts = 0;
System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 10");

        while (true) 
        {
System.out.print("Enter the number you guess: ");
            int userGuess = a.nextInt();
            attempts++;

            if (userGuess < secretNumber) 
            {
                System.out.println("The number is too low.");
            } 
            else if (userGuess > secretNumber) 
            {
                System.out.println("The number is too high.");
            } 
            else 
            {
                System.out.println("You win!");
                System.out.println("Number of attempts: " + attempts);
                break;
            }
         }

         
      }
   }
