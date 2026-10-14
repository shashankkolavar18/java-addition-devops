
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    public void testAddition() {
        assertEquals(5, Addition.add(2, 3));
    }

    @Test
    public void testAdditionWithZero() {
        assertEquals(7, Addition.add(7, 0));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(-3, Addition.add(-5, 2));
    }
}
