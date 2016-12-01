package com.li.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.li.views.viewactivity.WaterRippleActivity;

public class MainActivity extends AppCompatActivity {

    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIntent = new Intent();
    }

    public void showEffect(View view) {
        switch (view.getId()) {
            case R.id.btn_water_ripple:
                mIntent.setClass(MainActivity.this, WaterRippleActivity.class);
                break;
        }

        startActivity(mIntent);

    }
}
