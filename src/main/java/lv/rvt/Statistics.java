package lv.rvt;

public class Statistics {
    private int count;

    public Statistics() {
        
    }

    public void addNumber(int number) {
        count ++;
    }

    public int getCount() {
        return count;
    }
}
