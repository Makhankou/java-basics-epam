package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int initialSlices = scanner.nextInt();
        int slices = initialSlices;
        int numberOfPizzas = 1;
        while (slices % people != 0) {
            numberOfPizzas++;
            slices = initialSlices * numberOfPizzas;
        }
        System.out.println(numberOfPizzas);
    }
}
