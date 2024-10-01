package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int num = 1;
        while (num <= number) {
            System.out.println(num);
            num++;
        }
    }
}