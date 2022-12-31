import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCat {

    @Test
    public void getСatSoundsTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void getCatEatsMeatTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeat, cat.getFood());
    }

}