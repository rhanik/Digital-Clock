package com.example.digitalclock;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    TextClock textClock, textampm, textdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        textClock = findViewById(R.id.testclockid);
        textClock = findViewById(R.id.testampmid);
        textClock = findViewById(R.id.testdateid);
        Typeface myfont = Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/digital_font.ttf");
        textClock.setTypeface(myfont);
        textampm.setTypeface(myfont);
        textdate.setTypeface(myfont);
    }
}