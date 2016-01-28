package dev.duongnartist.lovelivewallpaper;

import java.util.ArrayList;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;

public class LoveBoard implements LoveAction {

    private ArrayList<LoveChar> loveChars;

    public LoveBoard() {
        init();
    }

    @Override
    public void init() {
        loveChars = new ArrayList<LoveChar>();
        loveChars.add(new LoveCharI());
        loveChars.add(new LoveCharL());
        loveChars.add(new LoveCharO());
        loveChars.add(new LoveCharV());
        loveChars.add(new LoveCharE());
        loveChars.add(new LoveCharU());
        for (LoveChar loveChar : loveChars) {
            loveChar.init();
        }
    }

    @Override
    public void update() {
        for (LoveChar loveChar : loveChars) {
            loveChar.update();
        }
    }

    @Override
    public void touch(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (y <= LoveView.height / 3) {
            loveChars.get(0).touch(motionEvent);
        } else if (y <= 2 * LoveView.height / 3) {
            if (x < LoveView.width / 4) {
                loveChars.get(1).touch(motionEvent);
            } else if (x < LoveView.width / 2) {
                loveChars.get(2).touch(motionEvent);
            } else if (x < 3 * LoveView.width / 4) {
                loveChars.get(3).touch(motionEvent);
            } else {
                loveChars.get(4).touch(motionEvent);
            }
        } else {
            loveChars.get(5).touch(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
        for (LoveChar loveChar : loveChars) {
            loveChar.draw(canvas);
        }
    }

}
