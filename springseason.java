package com.bridgelabz;

public class springseason {
    public static void main(String[] args) {
        System.out.println("Date: "+ args[0]);
        System.out.println("Month: "+ args[1]);
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        if(m>=3 && m <= 6 && d <= 20) {
            System.out.println("True");
        }else if ((m>=3 && m <= 6)&& d <= 20) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
