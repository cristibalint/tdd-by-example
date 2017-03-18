/**
 * Created by Cristian on 2017.03.16..
 */
public class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
