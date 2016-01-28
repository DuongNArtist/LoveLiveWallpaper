package dev.duongnartist.lovelivewallpaper;

import java.util.Random;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;

public class Heart {

    private Random random;
    private Paint paint;
    private Path path;
    private float srcX;
    private float srcY;
    private float verX;
    private float verY;
    private int radius;
    private int max;
    private int count;

    public Heart() {
        random = new Random();
        radius = 10 + random.nextInt(20);
        srcX = random.nextInt(LoveView.width);
        srcY = random.nextInt(LoveView.height);
        random();
        paint = new Paint();
        paint.setColor(Color.argb(random.nextInt(255), random.nextInt(255),
                random.nextInt(255), random.nextInt(255)));
        paint.setAntiAlias(true);
        path = new Path();
        path.setFillType(FillType.WINDING);
    }

    public void update() {
        if (count < max) {
            count++;
            srcX += verX;
            srcY += verY;
            if (srcX <= 0 || srcX >= LoveView.width) {
                verX *= -1;
            }
            if (srcY <= 0 || srcY >= LoveView.height) {
                verY *= -1;
            }
            path.reset();
            path.addCircle(srcX - radius, srcY - radius,
                    (int) (radius * Math.sqrt(2)), Direction.CW);
            path.addCircle(srcX + radius, srcY - radius,
                    (int) (radius * Math.sqrt(2)), Direction.CW);
            path.moveTo(srcX - 2 * radius, srcY);
            path.lineTo(srcX + 2 * radius, srcY);
            path.lineTo(srcX, srcY + 2 * ((int) Math.sqrt(2)) * radius);
            path.lineTo(srcX - 2 * radius, srcY);
            path.close();
        } else {
            random();
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawPath(path, paint);
    }

    public Path getPath() {
        return path;
    }

    public void random() {
        max = 1000 + random.nextInt(2000);
        count = 0;
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

    public void touch() {
        paint.setColor(Color.argb(random.nextInt(128), random.nextInt(255),
                random.nextInt(255), random.nextInt(255)));
    }
}
