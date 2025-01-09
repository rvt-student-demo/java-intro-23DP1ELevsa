package lv.rvt.connecticut;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }
    
    public double volume(){
        return this.length * this.width * this.height;
    }

    public double area(){
        return 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
    }

    public String toString(){
        return "length: " + this.length + " height: " + this.height +" width: " + this.width;
    }
}