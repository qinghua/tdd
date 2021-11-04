package ggg.idea.tdd;

public class ChickenRabbit {

    public int chicken(int heads, int feet) {
        // 4x + 4y = 4 * heads
        // 2x + 4y = feet
        // 2x = 4 * heads - feet
        return (4 * heads - feet) / 2;
    }
}
