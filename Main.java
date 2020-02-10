package com.siva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ethe x values");
        x = input.nextInt();
        System.out.println("Enter the y value");
        y = input.nextInt();
        System.out.println("After Swape values");
        y = x+y;
        x = y-x;
        y= y-x;
        System.out.println(x);
        System.out.println(y);

    }
}
