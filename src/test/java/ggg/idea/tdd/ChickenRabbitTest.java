package ggg.idea.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenRabbitTest {

    @Test
    public void should_return_1_for_2_heads_and_6_feet() {
        ChickenRabbit chickenRabbit = new ChickenRabbit();

        assertEquals(1, chickenRabbit.chicken(2, 6));
    }
}