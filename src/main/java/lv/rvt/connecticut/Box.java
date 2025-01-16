package lv.rvt.connecticut;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side; 
    }
    
    public Box(Box oldBox) {
        this.length = oldBox.length();
        this.width = oldBox.width();
        this.height = oldBox.height();
    }

    public double volume() {
        return this.length * this.width * this.height;
    }

    public double area() {
        return 2 * (faceArea() + topArea() + sideArea());
    }

    public String toString() {
        return "length: " + this.length + " height: " + this.height +" width: " + this.width;
    }

    private double faceArea() {
        return this.length * this.height;
    }

    private double topArea() {
        return this.length * this.width;
    }

    private double sideArea() {
        return this.width * this.height;
    }

    public double getFaceArea() {
        return faceArea();
    }

    public double getTopArea() {
        return topArea();
    }

    public double getSideArea() {
        return sideArea();
    }

    public double length() {
        return this.length;
    }

    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.length(), 1.25 * oldBox.width(), 1.25 * oldBox.height());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.length(), 0.75 * oldBox.width(), 0.75 * oldBox.height());
    }

    public boolean nests(Box outsideBox) {
        return outsideBox.length() > this.length() && outsideBox.width() > this.width() && outsideBox.height() > this.height();
    }
}