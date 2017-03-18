/**
 * Created by Cristian on 2017.03.18..
 */
public abstract class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    String currency() {
        return currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
