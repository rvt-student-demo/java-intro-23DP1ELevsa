package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17, 3);
        printTriangle(4);
    }

    // 1
    public static void printStars(int number) {
        int num = 0;
        while (num < number) {
            System.out.print("*");
            num++;
        }
        System.out.println();
    }

    // 2
    public static void printSquare(int size) {
        System.out.println();
        for (int a = 0; a < size; a++) {
            for(int b = 0; b < size; b++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3
    public static void printRectangle(int width, int height) {
        System.out.println();
        for (int e = 0; e < height; e++) {
            for(int f = 0; f < width; f++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4
    public static void printTriangle(int size) {
        System.out.println();
        for (int c = 0; c < size; c++) {
            for(int d = 0; d < c+1; d++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}