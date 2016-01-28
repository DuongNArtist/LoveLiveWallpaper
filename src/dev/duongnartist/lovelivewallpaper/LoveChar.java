package dev.duongnartist.lovelivewallpaper;

import java.util.ArrayList;

import android.graphics.Canvas;
import android.view.MotionEvent;

public abstract class LoveChar implements LoveAction {

    protected ArrayList<LovePoint> lovePoints;

    public LoveChar() {

    }

    public abstract void initChar();

    @Override
    public void init() {
        lovePoints = new ArrayList<LovePoint>();
        initChar();
        for (LovePoint lovePoint : lovePoints) {
            lovePoint.init();
        }
    }

    @Override
    public void update() {
        for (LovePoint lovePoint : lovePoints) {
            lovePoint.update();
        }
    }

    @Override
    public void touch(MotionEvent motionEvent) {
        for (LovePoint lovePoint : lovePoints) {
            lovePoint.touch(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        for (LovePoint lovePoint : lovePoints) {
            lovePoint.draw(canvas);
        }
    }

}
