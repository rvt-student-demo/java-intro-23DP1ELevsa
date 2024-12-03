package lv.rvt;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Izveidojam iespēju programmas lietotājam ievadīt personas datus un saglabāt csv failā ar iepriekš izveidoto metodi
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Paldies par reģistrāciju!");
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    }
}