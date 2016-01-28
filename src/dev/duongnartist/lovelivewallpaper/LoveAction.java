package dev.duongnartist.lovelivewallpaper;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface LoveAction {
    void init();

    void update();

    void touch(MotionEvent motionEvent);

    void draw(Canvas canvas);
}
