/**
 * Created by Cristian on 2017.03.18..
 */
public class Money {

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
