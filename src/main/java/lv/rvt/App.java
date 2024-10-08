package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        System.out.println("Printing stars");
        System.out.println();
        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);
        System.out.println();
        System.out.println();

        System.out.println("Printing a square");
        System.out.println();
        printSquare(4);
        System.out.println();

        System.out.println("Printing a rectangle");
        System.out.println();
        printRectangle(17, 3);
        System.out.println();

        System.out.println("Printing a triangle");
        System.out.println();
        printTriangle(4);
        System.out.println();

        System.out.println("Printing stars and spaces");
        System.out.println();
        printSpaces(1);
        printStars(4);
        System.out.println();

        System.out.println("Printing a right-leaning triangle");
        System.out.println();
        printTriangle2(4);

        System.out.println("Printing a Christmas tree");
        System.out.println();
        christmasTree(4);
        System.out.println();
        christmasTree(10);


    }

    // 1
    public static void printStars(int number) {
        int num = 0;
        while (num < number) {
            System.out.print("*");
            num++;
        }
    }

    // 2
    public static void printSquare(int size) {
        for (int a = 0; a < size; a++) {
            for(int b = 0; b < size; b++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3
    public static void printRectangle(int width, int height) {
        for (int e = 0; e < height; e++) {
            for(int f = 0; f < width; f++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4
    public static void printTriangle(int size) {
        for (int c = 0; c < size; c++) {
            for(int d = 0; d < c+1; d++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Part 2
    // 1
    public static void printSpaces(int number) {
        for (int m = 0; m < number; m++){
            System.out.print(" ");
        }
    }

    // 2
    public static void printTriangle2(int size) {
        for (int n = 0; n < size; n++) {
            printSpaces(size-(n+1));
            printStars(n+1);
            System.out.println();
        }
    }

    // 3
    public static void christmasTree(int height) {
        int z = 1;
        for (int v = 0; v < height; v++) {
            printSpaces(height-(v+1));
            printStars(z);
            z += 2;
            System.out.println();
        }
        printSpaces(height-2);
        printStars(3);
        System.out.println();
        printSpaces(height-2);
        printStars(3);

    }
}