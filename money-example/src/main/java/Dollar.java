/**
 * Created by Cristian on 2017.03.16..
 */
public class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
