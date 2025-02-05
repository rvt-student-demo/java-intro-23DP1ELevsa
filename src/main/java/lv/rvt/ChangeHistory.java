package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public double maxValue() {
        double max = this.history.get(0);
        for (Double value : history) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        double min = this.history.get(0);
        for (Double value : history){
            if (value > min){
                min = value;
            }
        }
        return min;
    }

    public double avarage() {
        double sum = 0;
        int sk = 0;
        for (double value : history) {
            sum = value + sum;
            sk ++;
        }
        return sum / sk;
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }
}