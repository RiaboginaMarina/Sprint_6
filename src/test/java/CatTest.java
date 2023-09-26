import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        assertEquals(food, cat.getFood());
    }
}
