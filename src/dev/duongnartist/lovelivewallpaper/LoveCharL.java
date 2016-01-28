package dev.duongnartist.lovelivewallpaper;

public class LoveCharL extends LoveChar {

    public LoveCharL() {

    }

    @Override
    public void initChar() {
        for (int x = LoveView.width / 16; x < 3 * LoveView.width / 16; x += LovePoint.STEP) {
            lovePoints.add(new LovePoint(x, 9 * LoveView.height / 16));
        }
        for (int y = 7 * LoveView.height / 16; y < 9 * LoveView.height / 16; y += LovePoint.STEP) {
            lovePoints.add(new LovePoint(LoveView.width / 16, y));
        }
    }

}
