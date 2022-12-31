import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestFeline {


    @Test
    public void testFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());

    }

    @Test
    public void testCountKittens() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));

    }
}
