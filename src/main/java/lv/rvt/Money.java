package lv.rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int plusEuros = this.euros + addition.euros;
        int plusCents = this.cents + addition.cents;

        if (plusCents >= 100) {
            plusEuros += plusCents / 100;
            plusCents = plusCents % 100;
        }

        return new Money(plusEuros, plusCents);
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
    
        if (newCents < 0) {
            newEuros -= 1;
            newCents += 100;
        }
    
        if (newEuros < 0) {
            return new Money(0, 0);
        }
    
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        
        return false;
    }
    
}