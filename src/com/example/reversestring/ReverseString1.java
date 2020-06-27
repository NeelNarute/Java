package com.example.reversestring;

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);

        String userInput = read.nextLine();

        System.out.println("User Entered : " + userInput);

        String reverse ="";

        for(int i= userInput.length()-1; i >=0;i-- ){
            reverse = reverse + userInput.charAt(i);
        }

        System.out.println("Reverse String : " + reverse);

    }
}
