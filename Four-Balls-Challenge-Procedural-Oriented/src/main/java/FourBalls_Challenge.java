import processing.core.PApplet;

public class FourBalls_Challenge extends PApplet {
    int WIDTH = 800;
    int HEIGHT = 600;
    int DIAMETER = 10;
    int[] ballsWidth = {0, 0, 0, 0};
    int[] ballsHeightPosition = {1, 2, 3, 4};
    int[] ballsIncrementSpeed = {1, 2, 3, 4};

    public static void main(String[] args) {
        PApplet.main("FourBalls_Challenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int ball = 0; ball < 4; ball++) {
            ballsWidth[ball] = drawCircle(ballsWidth[ball], ballsHeightPosition[ball], ballsIncrementSpeed[ball]);
        }
    }

    int drawCircle(int width, int heightPosition, int incrementSpeeed) {
        int height = heightPosition * HEIGHT / 5;
        ellipse(width, height, DIAMETER, DIAMETER);
        width += incrementSpeeed;
        return width;
    }
}