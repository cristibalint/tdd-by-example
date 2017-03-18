/**
 * Created by Cristian on 2017.03.18..
 */
public class Sum implements Expression {
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
