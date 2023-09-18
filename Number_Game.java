//Random Number Generator 

import java.util.*;
public class RandomNumberGeneration {
	
	public static void main(String args[])
	{
	//creating object for Random class	
	Random rand=new Random();
	int rand_num=0;
	
	Scanner in=new Scanner(System.in);
	System.out.println("--------------------------------------------------------------------------------");
	System.out.println("\t\t\t\tWelcome to Number Guesser\n\n\tInstructions\n\t\t1.You have 3 chances to guess the number\n\t\t2.Enter a number which is less than 10(only positive numbers)");
	System.out.println("--------------------------------------------------------------------------------");
	int chance=0,correct=0;
    int score=3;
    int choice=1;
    
    //looping upto 3 chances
	while(chance++<3 && choice==1)	
	{
	if(chance==1) 
		{rand_num=rand.nextInt(10);
	System.out.println("RANDOM: "+rand_num);}
	System.out.println("\nCHANCE NO: "+chance);
	System.out.println("Enter a number from 0 to 10: ");
	int num=0;
	try 
	{ 
		num=in.nextInt();
	
	}
	catch(Exception e)
	{
		System.err.println("Enter only Integers\n");
		break;
	}
	if(num==rand_num)
	{
		System.out.println("\n--------------------------");
		System.out.println("You Guessed it right!!!");
		System.out.println("YOUR SCORE: "+score*10);
		System.out.println("--------------------------\n");
		System.out.println("Wish to play again ?\n\t1:YES\n\t2:NO");
		choice =in.nextInt();
		if(choice==1)
		{
			chance=0;
			score=4;
		}
		else 
		{
		  break;
		}
	}
	else if(num>rand_num)
	{
		System.out.println("Guess is too high");
	}
	else
	{
		System.out.println("Guess is too low");
	}
	if(chance==3 && correct==0)
	{
		System.out.println("-----------------------------------------");
		System.out.println("Oops! You didn't find the correct number");
		System.out.println("The correct number : "+rand_num);
		System.out.println("-----------------------------------------\n");
		System.out.println("Wish to play again ?\n\t1:YES\n\t2:NO");
		choice =in.nextInt();
		if(choice==1)
			{
				chance=0;
				score=4;
			}
	}
	
	score--;
	}
	System.out.println("------------------THANK YOU-------------------");
	}

}
