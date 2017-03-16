/**
 * Created by Cristian on 2017.03.16..
 */
public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
