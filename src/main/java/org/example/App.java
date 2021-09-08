package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the input string?");
        String message = scanner.nextLine();
        int count = message.length();
        System.out.println(message + " has " + count + " characters");

    }

}





