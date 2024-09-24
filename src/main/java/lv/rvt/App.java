package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int number = 1;
        while (number <= lastNumber) {
            sum += number;
            number ++;
        }
        System.out.println(sum);
    }
}