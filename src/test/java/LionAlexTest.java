import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexTest {

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex();
        Assert.assertEquals(List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex();
        Assert.assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        LionAlex lionAlex = new LionAlex();
        Assert.assertEquals(0, lionAlex.getKittens());
    }

}
