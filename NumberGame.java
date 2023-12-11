package com.mycompany.numbergame;
import java.util.Random;
import java.util.Scanner;
public class NumberGame{

	public static void main(String args[])
	{
		
                Scanner sc=new Scanner(System.in);
                Random random = new Random();
                int attempts=5;
                int chances=5;
                int randomNumber = random.nextInt(100);
                System.out.println("The correct number is:"+randomNumber);
                for(int i=1;i<=attempts;i++)
                {
              
                int userInput;
                System.out.println("Attempts:"+chances);   
                System.out.println("Guess the upcoming number between 1 to 100:");
                userInput=sc.nextInt();
                
                if(randomNumber==userInput)
                {
                    System.out.println("Guess is correct");
                    break;
                }
		else
                {
                 System.out.println("Guess is too low");   
                 
                }
                 chances=chances-1;
                } 
                
                System.out.println("The correct number is:"+randomNumber);
                System.out.println("Game Over!!!!!!!");   
            }
}

