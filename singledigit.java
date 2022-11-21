package com.bridgelabz;

public class singledigit {
    static void printValue(char digit) {
        switch (digit)
        {
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.println("three");
                break;
        }
    }

    // Function to iterate through every
// digit in the given number
    static void printWord(String N)
    {
        int i, length = N.length();

        // Finding each digit of the number
        for (i = 0; i < length; i++)
        {

            // Print the digit in words
            printValue(N.charAt(i));
        }
    }

    // Driver code
    public static void main(String[] args) {
        String N = "123";
        printWord(N);
    }
}