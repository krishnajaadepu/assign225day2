package com.bridgelabz;


import java.util.Scanner;

public class displayunit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int thousand = 1000;

        int hundreds = 100;

        int tens = 10;

        int ones = 1;

        //Input 4 digit number

        System.out.print("Enter 4 digit number: ");

        int number = input.nextInt();

        if (number <= 9999 && number > 999)

        {

            thousand =  number/1000;
            System.out.printf("thousands place digit: " + thousand  );
            hundreds = (number/100)%10;
            System.out.printf("\nHundreds place digit: " + hundreds);
            tens = (number/10)%10;  // compare with your code
            System.out.printf("\nTens place digit: " + tens);
            ones = (number%10);   // compare with your code
            System.out.printf("\nOnes place digit: " + ones);
        }
        else
        {
            if (number > 9999)
                System.out.println("\nError! Number more then  digits.");
            if (number < 1000)
                System.out.println("Error! Number less then 4 digits.");

        }
    }
}
