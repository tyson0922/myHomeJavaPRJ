package org.example;

import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args){
        System.out.println("Please type in a year you were born");
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x <= 1980){
            System.out.println("You are over 40");
        }
        else if (1981 < x && x < 1996) {
            System.out.println("You are a millennial");
        }
        else {
                System.out.println("You are a less than 30");
        }
    }
}
