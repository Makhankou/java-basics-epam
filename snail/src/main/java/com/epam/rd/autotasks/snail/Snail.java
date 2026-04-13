package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int reached = 0;
        int days = 0;
        do {
            days++;
            reached = reached + a;
            if (reached >= h) {
                System.out.println(days);
                break;
            }
            reached = reached - b;
            if (reached <= 0) {
                System.out.println("Impossible");
                break;
            }
        } while (reached < h);
    }
}
