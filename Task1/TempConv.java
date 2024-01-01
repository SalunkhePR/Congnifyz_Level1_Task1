

// Task 1 :: Temperature Converter 


import java.util.Scanner;
/**
 * TempConv
 */
public class TempConv {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("***********************************************");

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.println("Enter your choice::");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter Temperature (Celsius)::");
            float cel = scanner.nextFloat();

            float fah = (cel * 9/5) + 32;

            System.out.println("Fahrenheit Temperature is::"+fah);
            System.out.println("Thank you!!!");
        }
        else if (choice == 2) {
            System.out.println("Enter Temperature (Fahrenheit)::");
            float fah = scanner.nextFloat();

            float cel = (fah - 32) * 5/9;

            System.out.println("Degree Celsius Temperature is::"+cel);
            System.out.println("Thank you!!!");
        } else {
            System.out.println("Invalid Choice!!");
            System.out.println("Exiting...");
        }

    }
}