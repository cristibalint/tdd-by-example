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
        five.times(2);

        assertEquals(10, five.amount);
    }
}
