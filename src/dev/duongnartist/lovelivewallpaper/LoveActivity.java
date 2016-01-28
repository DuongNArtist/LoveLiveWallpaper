package dev.duongnartist.lovelivewallpaper;

import android.app.Activity;
import android.os.Bundle;

public class LoveActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new LoveView(this));
    }
}
