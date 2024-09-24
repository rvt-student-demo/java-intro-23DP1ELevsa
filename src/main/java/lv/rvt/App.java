package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        for (int number = Integer.valueOf(scanner.nextLine()); number <= 100; number++) {
            System.out.println(number);
        }
    }
}