package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! What's your name?");

        Scanner Name = new Scanner(System.in);
        System.out.println("Hello, " + Name.nextLine() + "!");

    }
}