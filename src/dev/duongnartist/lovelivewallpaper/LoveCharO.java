package dev.duongnartist.lovelivewallpaper;


public class LoveCharO extends LoveChar {

    public LoveCharO() {

    }

    @Override
    public void initChar() {
        for (int x = 5 * LoveView.width / 16; x < 7 * LoveView.width / 16; x += LovePoint.STEP) {
            lovePoints.add(new LovePoint(x, 7 * LoveView.height / 16));
            lovePoints.add(new LovePoint(x, 9 * LoveView.height / 16));
        }
        for (int y = 7 * LoveView.height / 16; y < 9 * LoveView.height / 16; y += LovePoint.STEP) {
            lovePoints.add(new LovePoint(5 * LoveView.width / 16, y));
            lovePoints.add(new LovePoint(7 * LoveView.width / 16, y));
        }
    }

}
