package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;
import javax.sound.midi.Soundbank;
import lv.rvt.connecticut.Box; 
 
public class App { 
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
        }
}