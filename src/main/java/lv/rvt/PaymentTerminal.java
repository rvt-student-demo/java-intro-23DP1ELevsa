package lv.rvt;

public class PaymentTerminal {
    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        affordableMeals += 1;
        double affordableMeal = 2.50;
        if (payment >= affordableMeal) {
            this.money += affordableMeal;
            return payment - affordableMeal;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        heartyMeals += 1;
        double heartyMeal = 4.30;
        if (payment >= heartyMeal) {
            this.money += heartyMeal;
            return payment - heartyMeal;
        } else {
            return payment;
        }    
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMealPrice = 2.50;

        if (card.takeMoney(affordableMealPrice)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMealPrice = 4.30;

        if (card.takeMoney(heartyMealPrice)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum); 
            this.money += sum;  
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}