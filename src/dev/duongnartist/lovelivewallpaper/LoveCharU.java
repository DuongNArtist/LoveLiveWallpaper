package dev.duongnartist.lovelivewallpaper;

public class LoveCharU extends LoveChar {

    public LoveCharU() {

    }

    @Override
    public void initChar() {
        for (int x = 2 * LoveView.width / 8; x < 6 * LoveView.width / 8; x += LovePoint.STEP) {
            lovePoints.add(new LovePoint(x, 15 * LoveView.height / 16));
        }
        for (int y = LoveView.height / 16; y < 5 * LoveView.height / 16; y += LovePoint.STEP) {
            lovePoints.add(new LovePoint(2 * LoveView.width / 8, 5
                    * LoveView.height / 8 + y));
            lovePoints.add(new LovePoint(6 * LoveView.width / 8, 5
                    * LoveView.height / 8 + y));
        }
    }

}
