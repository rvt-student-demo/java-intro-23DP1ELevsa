package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amountOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                amountOfNumbers += 1;
                sum += number;
        }
    }
    System.out.println("Number of numbers: " + amountOfNumbers);
    System.out.println("Sum of the numbers: " + sum);
}
}