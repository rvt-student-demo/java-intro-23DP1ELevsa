package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void printSquare(int size) {
        for (int a = 0; a < size; a++) {
            for(int b = 0; b < size; b++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printSquare(4);
    }
}