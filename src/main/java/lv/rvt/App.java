package lv.rvt;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;
        System.out.println("Welcome to person manager, type \"help\" to see available commands.");

        while (isProgramRunning) {
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                
                System.out.println("Thanks, bye bye!");
                isProgramRunning = false;
            
            } else if (command.equals("show")) {

                //printēta tabula ar persons.csv datiem
                // izmantojot printf metodi
                // bodymassindex satur 2 ciparus aiz komata vau punkta "0.01"
                System.out.println("Show all persons");
                ArrayList<Person> allPersons = PersonManager.getPersonList();
                System.out.println("----------------------------------------------------");
                System.out.println("|  Name  | Age | Weight | Height | Body mass index |");
                System.out.println("----------------------------------------------------");
                for (Person person1: allPersons) {
                    System.out.printf("| %-7s| %-4d| %-7d| %-7d| %-16.2f|", person1.getName(), person1.getAge(), person1.getWeight(), person1.getHeight(), person1.bodyMassIndex());
                    System.out.println();
                }

            } else if (command.equals("add")) {

                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Enter your age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter your weight: ");
                int weight = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter your height: ");
                int height = Integer.valueOf(scanner.nextLine());

                Person person = new Person(name, age, weight, height);
                PersonManager.addPerson(person);
                System.out.println("Person added!");

            } else if (command.equals("help")) {

                System.out.println("show: parādīt visas personas no csv faila");
                System.out.println("add: pievienot personu csv failam");
                System.out.println("help: parāda iespējamas komandas");
                System.out.println("exit: aptur programmas darbību");
            }

            System.out.println("Your command was: " + command);
        }
    }
}