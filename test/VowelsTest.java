package countingvowels.test;

import countingvowels.base.Vowels;
import java.util.Scanner;

public class VowelsTest {
  
    public static void main(String[] args) {          
        
        Vowels test = new Vowels();

        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter a single word or letter, so I can count how many Vowels : "); 

        String userInput = reader.next();

        test.countingVowels(userInput);

        

    }


}
