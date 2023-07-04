import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;

    LionAlex alex = new LionAlex(feline);

    @Test
    public void getFriendsTest() throws Exception {
        Assert.assertEquals(List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() {
        Assert.assertEquals(0, alex.getKittens());
    }

}
