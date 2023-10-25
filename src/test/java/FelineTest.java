import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        assertEquals(food, feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutParameterReturnOne() {
        Feline feline = new Feline();
        int numberOfKittens = 1;
        assertEquals(numberOfKittens, feline.getKittens());
    }

    @Test
    public void getKittensWithParameterReturnParameter() {
        Feline feline = new Feline();
        int numberOfKittens = 5;
        assertEquals(numberOfKittens, feline.getKittens(numberOfKittens));
    }
}
