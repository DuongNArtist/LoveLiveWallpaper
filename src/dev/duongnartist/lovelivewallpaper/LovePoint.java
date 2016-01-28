package dev.duongnartist.lovelivewallpaper;

import java.util.Random;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

public class LovePoint implements LoveAction {

    public static final int STEP = 16;

    private Paint paint;
    private Random random;
    private float srcX;
    private float srcY;
    private float verX;
    private float verY;
    private float dstX;
    private float dstY;
    private float radius;
    private int count;
    private int max;
    private boolean moving;

    public LovePoint(float dstX, float dstY) {
        this.dstX = dstX;
        this.dstY = dstY;
    }

    @Override
    public void update() {
        if (moving) {
            srcX += verX;
            srcY += verY;
            if (srcX <= 0 || srcX >= LoveView.width) {
                verX *= -1;
            }
            if (srcY <= 0 || srcY >= LoveView.height) {
                verY *= -1;
            }
        } else {
            if (count < max) {
                count++;
                srcX += verX;
                srcY += verY;
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(srcX, srcY, radius, paint);
    }

    @Override
    public void init() {
        random = new Random();
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.rgb(random.nextInt(256), random.nextInt(256),
                random.nextInt(256)));
        moving = true;
        count = 0;
        radius = 4;
        max = 256;
        srcX = random.nextInt(LoveView.width);
        srcY = random.nextInt(LoveView.height);
        random();
    }

    @Override
    public void touch(MotionEvent motionEvent) {
        moving = !moving;
        if (moving) {
            random();
        } else {
            count = 0;
            verX = (dstX - srcX) / max;
            verY = (dstY - srcY) / max;
        }
    }

    public void random() {
        if (random.nextBoolean()) {
            verX = random.nextFloat();
        } else {
            verX = -random.nextFloat();
        }
        if (random.nextBoolean()) {
            verY = random.nextFloat();
        } else {
            verY = -random.nextFloat();
        }
    }
}
