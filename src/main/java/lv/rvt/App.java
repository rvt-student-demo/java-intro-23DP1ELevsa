package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;
import javax.sound.midi.Soundbank;
import lv.rvt.connecticut.Box; 
 
public class App { 
    public static void main( String[] args ) {
        Box box = new Box( 2.5, 5.0, 6.0 );

        System.out.println("Area: " + box.area() + " volume: " + box.volume());
        System.out.println("topArea: " + box.getTopArea());
        System.out.println(box);
    }
}