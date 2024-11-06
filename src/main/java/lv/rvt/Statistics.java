package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private int num;


    public Statistics() {

    }

    public void addNumber(int number) {
        this.num = number;
        count++;
        sum += this.num;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = this.sum / (this.count * 1.0);
        return average;
    }
}