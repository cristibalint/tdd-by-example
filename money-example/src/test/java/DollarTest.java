import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Cristian on 2017.03.16..
 */
public class DollarTest {

    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);

        assertEquals(10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
