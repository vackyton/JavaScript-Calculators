package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // byte > int ? long > float > double

    public static void main(String[] args) {
        Scanner Moneey = new Scanner(System.in);
        Scanner interest = new Scanner(System.in);
        Scanner Months = new Scanner(System.in);
        System.out.println("Months:");
        byte Month = Months.nextByte();
        System.out.println("Money Borrowed:");
        byte Money = Moneey.nextByte();
        System.out.println("Interest:");
        byte Interest = interest.nextByte();
        System.out.println("You have to pay " + Math.round(Money * Month / Interest));
    }
}
