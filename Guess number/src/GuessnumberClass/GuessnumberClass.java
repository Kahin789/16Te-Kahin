package GuessnumberClass;

import java.util.Random;
import java.util.Scanner;

public class GuessnumberClass {

	{
		
	}

    
    public static void main(String[] args) {
        Random rn = new Random();
        int RandomInt = rn.nextInt(100);
        int GuessNumber=0, GuessTime=0;
        while(GuessNumber != RandomInt) {
            System.out.print("Guess a number 1-100!: ");
            Scanner in = new Scanner(System.in);
            GuessNumber = in.nextInt();
            GuessTime ++;
            if (GuessNumber < RandomInt)
            {
            	
            }else
            {
            	
            }
            int newInt = GuessNumber - RandomInt;
            
            if (newInt <= -20){
                System.out.print("Mycket mer - ");
            }
            else if (newInt >= 20)
            {
                System.out.print("Mycket mindre - ");
            }else
            
                if (newInt <= -10){
                System.out.print("Mer - ");
            }
            else if (newInt >= 10)
            {
                System.out.print("Mindre - ");
            }else
            
                if (newInt <= -5){
                System.out.print("Lite mer - ");
            }
            else if (newInt >= 5)
            {
                System.out.print("Lite mindre - ");
            }
            else if (newInt >= 1)
            {
                System.out.print("Pyttelite mer - ");
            }
            else if (newInt >= -1)
            {
                System.out.print("Pyttelite mindre - ");
            }
        }
        
        
        System.out.println("Success! You guessed the right number " + RandomInt + "! It took you " + GuessTime + " attempt(s)!");
    }
}
