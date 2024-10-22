package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();
        
        numberList.add(Integer.valueOf(scanner.nextLine()));

        while (numberList.get(numberList.size() - 1) != -1) {
            numberList.add(Integer.valueOf(scanner.nextLine()));
        } 
        
        System.out.print("From where? ");
        int from = Integer.valueOf(scanner.nextLine());

        while (numberList.size() - 1 < from || from < 0) {
            from = Integer.valueOf(scanner.nextLine());
        }

        System.out.print("To where? ");
        int to = Integer.valueOf(scanner.nextLine());

        while (numberList.size() - 1 < to || to < 0) {
            to = Integer.valueOf(scanner.nextLine());
        }

        while (from <= to) {
            System.out.println(numberList.get(from));
            from ++;
        }
    }   
}