import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {


    @Test
    public void shouldSmallBonusRegistered() {
        BonusService service = new BonusService();

        int actual = service.calc(1000, true);
        int expected = 30;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBigBonusRegistered() {
        BonusService service = new BonusService();

        int actual = service.calc(100_000, true);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }


}
