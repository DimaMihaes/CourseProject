package lesson9homework;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String args[])
    {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the phrase: ");
        String input = "";
        input = a.next();

        char search = 'a';

        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }

        System.out.println("The Character '"+search+"' appears "+count+" times.");
    }
}
