package countingvowels.base;

import java.util.Scanner;


public class Vowels {

    public Vowels(){
        
    }

    public static void countingVowels(String userInput){

        
        try {
            
            int countUserInput = 0;

            for (int i = 0; i < userInput.length(); i++) {
                char ch = userInput.charAt(i);
                ch = Character.toLowerCase(ch);

                if (ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
    
                    countUserInput++;
                }

            }
                           
            System.out.println(countUserInput);     
        
            
        } catch (Exception e) {
                System.out.println("Invalid input: This value is not a word or letter");
        }


    }
