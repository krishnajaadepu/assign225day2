package com.bridgelabz;

public class forloop {
    public static void main(String[] args) {
    int i, num = 5, sum = 0;
        for(i = 1; i <= num; ++i)
    {
//adding the value of i into sum variable
        sum = sum + i;
    }
//prints the sum
        System.out.println("Sum of First 5 Natural Numbers is = " + sum);
}
}