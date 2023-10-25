import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class LionTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getKittens() throws Exception {
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка", feline);
        int numberOfLionKittens = 1;
        assertEquals("Количество котят не равно 1", numberOfLionKittens, lion.getKittens());
    }

    @Test
    public void invalidSexShowsException() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        new Lion("invalid", feline);
    }

    @Test
    public void getFood() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Трава");
        when(feline.eatMeat()).thenReturn(food);
        Lion lion = new Lion("Самец", feline);
        assertEquals(food, lion.getFood());
    }

}
