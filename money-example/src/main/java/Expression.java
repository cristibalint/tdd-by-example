/**
 * Created by Cristian on 2017.03.18..
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
