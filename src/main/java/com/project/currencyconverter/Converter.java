package com.project.currencyconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Currency Converter");
            System.out.println("1. USD to EUR");
            System.out.println("2. EUR to USD");
            System.out.print("Choose an option: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                return;
            }

            double amount;
            switch (choice) {
                case 1:
                    System.out.print("Enter amount in USD: ");
                    amount = scanner.nextDouble();
                    System.out.println("Equivalent in EUR: " + CurrencyApi.convert("USD", "EUR", amount));
                    break;
                case 2:
                    System.out.print("Enter amount in EUR: ");
                    amount = scanner.nextDouble();
                    System.out.println("Equivalent in USD: " + CurrencyApi.convert("EUR", "USD", amount));
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
