package dev.duongnartist.lovelivewallpaper;

import java.util.ArrayList;

public class LoveCharI extends LoveChar {

    public LoveCharI() {

    }

    @Override
    public void initChar() {
        lovePoints = new ArrayList<LovePoint>();
        for (int x = 2 * LoveView.width / 8; x < 6 * LoveView.width / 8; x += LovePoint.STEP) {
            lovePoints.add(new LovePoint(x, LoveView.height / 16));
            lovePoints.add(new LovePoint(x, 5 * LoveView.height / 16));
        }
        for (int y = LoveView.height / 16; y < 5 * LoveView.height / 16; y += LovePoint.STEP) {
            lovePoints.add(new LovePoint(LoveView.width / 2, y));
        }
    }
}
