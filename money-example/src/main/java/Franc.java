/**
 * Created by Cristian on 2017.03.18..
 */
public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
