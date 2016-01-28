package dev.duongnartist.lovelivewallpaper;

public class LoveCharE extends LoveChar {

    public LoveCharE() {

    }

    @Override
    public void initChar() {
        for (int x = 13 * LoveView.width / 16; x < 15 * LoveView.width / 16; x += LovePoint.STEP) {
            lovePoints.add(new LovePoint(x, 7 * LoveView.height / 16));
            lovePoints.add(new LovePoint(x, 8 * LoveView.height / 16));
            lovePoints.add(new LovePoint(x, 9 * LoveView.height / 16));
        }
        for (int y = 7 * LoveView.height / 16; y < 9 * LoveView.height / 16; y += LovePoint.STEP) {
            lovePoints.add(new LovePoint(13 * LoveView.width / 16, y));
        }
    }

}
