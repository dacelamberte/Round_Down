package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter number with comma");
	double numberd = input.nextDouble();
	int number = (int)numberd;
        System.out.println(number);


    }
}
