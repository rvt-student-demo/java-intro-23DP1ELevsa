package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void printTriangle(int size) {
        for (int a = 0; a < size; a++) {
            for(int b = 0; b < a+1; b++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printTriangle(4);
    }
}