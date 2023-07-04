import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals(List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals(0, alex.getKittens());
    }

}
