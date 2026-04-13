package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        if (count == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (count < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            for (int i = 0; i < count; i++) {
                String Name = scanner.nextLine();
                System.out.println("Hello, " + Name);
        }
        }
    }
}
