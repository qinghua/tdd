package ggg.idea.tdd;

public class ChickenRabbitTdd {

    public int chicken(int heads, int feet) {
        if (feet < heads * 2) {
            throw new CanNotCalculateException();
        }

        if (feet > heads * 4) {
            throw new CanNotCalculateException();
        }

        if (feet % 2 != 0) {
            throw new CanNotCalculateException();
        }

        return (4 * heads - feet) / 2;
    }
}
