package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void printRectangle(int width, int height) {
        for (int a = 0; a < height; a++) {
            for(int b = 0; b < width; b++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printRectangle(17, 3);
    }
}