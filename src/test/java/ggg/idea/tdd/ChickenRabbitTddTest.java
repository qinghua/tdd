package ggg.idea.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenRabbitTddTest {

    @Test
    public void should_return_1_for_1_head_and_2_feet() {
        ChickenRabbitTdd chickenRabbitTdd = new ChickenRabbitTdd();

        assertEquals(1, chickenRabbitTdd.chicken(1, 2));
    }

    @Test
    public void should_return_2_for_2_heads_and_4_feet() {
        ChickenRabbitTdd chickenRabbitTdd = new ChickenRabbitTdd();

        assertEquals(2, chickenRabbitTdd.chicken(2, 4));
    }

}
