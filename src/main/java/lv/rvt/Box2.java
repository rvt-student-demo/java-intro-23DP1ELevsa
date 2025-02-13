package lv.rvt;
import lv.rvt.Book;
import lv.rvt.CD;
import java.util.ArrayList;

public class Box2 {
    private double capacity;
    int items = 0;
    double totalWeight = 0;

    public Box2(int kg){
        this.capacity = kg;
    }

    public void add(Book book){
        if(this.capacity > book.weight()) {
            items += 1;
            totalWeight += book.weight();
            this.capacity -= book.weight();
        }
    }
    
    public void add(CD cd){
        if(this.capacity > cd.weight()) {
            items += 1;
            totalWeight += cd.weight();
            this.capacity -= cd.weight();
        }
    }


    public String toString() { 
        return "Box: " + items + " items, " + "total weight " +     
        totalWeight + " kg"; 
    }
}