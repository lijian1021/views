package com.li.views.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/12/1.
 */


public class WaterRippleView extends View {
    public WaterRippleView(Context context) {
        super(context);
    }

    public WaterRippleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    private int width;
    private int height;
    private void init() {
        initPaint();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        width = MeasureSpec.getSize(widthMeasureSpec);
        height = MeasureSpec.getSize(heightMeasureSpec);

        Log.e("tag", "widthMode: " + getMode(widthMode) +
                " heightMode: " + getMode(heightMode) +
                " width: " + width +
                " height: " + height);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private String getMode(int mode) {
        String measureMode = "";
        switch (mode) {
            case MeasureSpec.AT_MOST:
                measureMode = "AT_MOST";
                break;
            case MeasureSpec.EXACTLY:
                measureMode = "EXACTLY";
                break;
            case MeasureSpec.UNSPECIFIED:
                measureMode = "UNSPECIFIED";
                break;
        }
        return measureMode;
    }

    private Paint mPaint;

    private void initPaint(){
        mPaint=new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Point startPoint=new Point(50, (int) (height*0.6f));
        //横线
        canvas.drawLine(startPoint.x,startPoint.y,width-50,startPoint.y,mPaint);
        //竖线
        canvas.drawLine(startPoint.x,startPoint.y,startPoint.x,50,mPaint);
    }
}
