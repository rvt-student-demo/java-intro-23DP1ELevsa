package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void printStars(int number) {
        int num = 0;
        while (num < number) {
            System.out.print("*");
            num++;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}