package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double result;
        if (discriminant < 0) {
            System.out.println("no roots");
        } else if (discriminant == 0) {
            result = -b / (2 * a);
            System.out.print(result);
        } else {
            result = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.print(result);
            result = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.print(" " +result);
        }
    }

}
