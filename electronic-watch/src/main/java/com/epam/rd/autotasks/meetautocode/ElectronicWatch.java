package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int remainder = seconds % 86400;
        int hoursWatch = remainder / 3600;
        remainder = remainder % 3600;
        int minutesWatch = remainder / 60;
        int secondsWatch = remainder % 60;
        System.out.println(hoursWatch + ":" + String.format("%02d", minutesWatch) + ":" + String.format("%02d", secondsWatch));
    }
}
