package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            intList.add(input);
            if (input == 0) {
                break;
            }
        }

        // saskaitam visu elementu summu, kas atrodas ArrayListā
        int listSum = 0;
        for (int i = 0; i < intList.size(); i++) {
            listSum += intList.get(i);
        }
        System.out.println(listSum);
    }   
}