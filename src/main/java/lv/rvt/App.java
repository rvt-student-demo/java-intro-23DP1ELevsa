package lv.rvt;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Example main program for the first section of the exercise

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 7, 110);
        Person peter = new Person("Peter", 33, 85, 176);

        System.out.println(ethan.getName() + "'s" + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s" + " weight: " + childrensHospital.weigh(peter) + " kilos");
    }
}