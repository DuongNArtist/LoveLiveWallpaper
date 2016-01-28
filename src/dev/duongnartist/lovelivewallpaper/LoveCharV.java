package dev.duongnartist.lovelivewallpaper;

public class LoveCharV extends LoveChar {

    public LoveCharV() {

    }

    @Override
    public void initChar() {
        float scale = ((float) LoveView.width / LoveView.height) / 2;
        for (int y = 7 * LoveView.height / 16; y < 9 * LoveView.height / 16; y += LovePoint.STEP) {
            lovePoints.add(new LovePoint(
                    5.5f * LoveView.width / 16 + y * scale, y));
            lovePoints.add(new LovePoint(14.5f * LoveView.width / 16 - y
                    * scale, y));
        }
    }

}
