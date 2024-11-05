package lv.rvt;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Ja mēs negribam izmantot tavu default toString metodi
    // Mēs izmantosim savu realizāciju
    @Override
    public String toString() {
        return "This animal is " + this.name;
    }
}

