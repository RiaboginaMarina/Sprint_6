import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean haseMane;

    public LionParameterizedTest(String sex, boolean haseMane) {
        this.sex = sex;
        this.haseMane = haseMane;
    }

    @Parameterized.Parameters
    public static Object[][] getHaseMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void doesHaveMainForMaleAndFemale() throws Exception{
        Lion lion = new Lion(sex, new Feline());
        assertEquals(haseMane, lion.doesHaveMane());

    }
}