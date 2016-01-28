package dev.duongnartist.lovelivewallpaper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("ClickableViewAccessibility")
public class LoveView extends View {

    public static int width;
    public static int height;
    private LoveBoard loveBoard;

    public LoveView(Context context) {
        super(context);
        width = getResources().getDisplayMetrics().widthPixels;
        height = getResources().getDisplayMetrics().heightPixels;
        loveBoard = new LoveBoard();
        loveBoard.init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        loveBoard.update();
        loveBoard.draw(canvas);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        loveBoard.touch(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
