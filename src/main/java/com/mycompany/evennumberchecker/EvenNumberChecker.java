/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evennumberchecker;

/**
 *
 * @author mdewlok
 */
import java.util.Scanner;

public class EvenNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;

        // Loop until sentinel value is entered
        while (number != 999) {

            System.out.print("Enter an even number (or 999 to exit): ");
            number = input.nextInt();

            if (number == 999) {
                System.out.println("Program ended.");
            } 
            else if (number % 2 == 0) {
                System.out.println("Good job!");
            } 
            else {
                System.out.println("Error: That is not an even number.");
            }
        }

        input.close();
    }
}
