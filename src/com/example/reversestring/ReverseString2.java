package com.example.reversestring;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter string to reverse :");
        String userInput = read.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = userInput.length()-1; i>=0;i--){
            stringBuilder.append(userInput.charAt(i));
        }

        System.out.println("Reverse String :" + stringBuilder);
    }
}
