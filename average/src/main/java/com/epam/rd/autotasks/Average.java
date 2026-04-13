package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int counter = 0;
        while (number != 0) {
            sum = sum + number;
            number = scanner.nextInt();
            counter++;
        }
        int average;
        average = sum / counter;
        System.out.println(average);
    }

}
