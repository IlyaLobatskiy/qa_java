import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest extends BaseTest{
    @Mock
    Feline feline;

    private String sexLion;
    private boolean hasManeException;

    public LionTest(String sexLion, boolean hasManeException) {
        this.sexLion = sexLion;
        this.hasManeException = hasManeException;
    }

    @Parameterized.Parameters(name = "Пол {0}, Есть ли грива {1}")
    public static Object[][] getLionParam() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void isHasManeTest() throws Exception {
        Lion lion = new Lion(sexLion);
        Assert.assertEquals(hasManeException, lion.doesHaveMane());
    }

    @Test
    public void isHasManeExceptionTest() throws Exception {
        try {
            Lion lion = new Lion("Оно");
        } catch (Exception exception){
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void getKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
