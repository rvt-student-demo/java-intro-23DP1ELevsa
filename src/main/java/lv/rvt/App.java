package lv.rvt;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Deniss", 17, 69, 182);

        PersonManager.addPerson(person);
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    }
}