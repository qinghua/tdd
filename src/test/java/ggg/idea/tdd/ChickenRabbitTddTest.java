package ggg.idea.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChickenRabbitTddTest {

    public static final ChickenRabbitTdd chickenRabbitTdd = new ChickenRabbitTdd();

    @Test
    public void should_return_1_for_1_head_and_2_feet() {
        assertEquals(1, chickenRabbitTdd.chicken(1, 2));
    }

    @Test
    public void should_return_2_for_2_heads_and_4_feet() {
        assertEquals(2, chickenRabbitTdd.chicken(2, 4));
    }

    @Test
    public void should_return_1_for_2_heads_and_6_feet() {
        assertEquals(1, chickenRabbitTdd.chicken(2, 6));
    }

    @Test
    public void should_throw_exception_for_2_heads_and_2_feet() {
        assertThrows(CanNotCalculateException.class, () -> chickenRabbitTdd.chicken(2, 2));
    }

    @Test
    public void should_throw_exception_for_2_heads_and_10_feet() {
        assertThrows(CanNotCalculateException.class, () -> chickenRabbitTdd.chicken(2, 10));
    }

}
