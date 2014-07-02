package com.example.Compass;


import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class CompassView extends View {
    public CompassView(Context context) {
        super(context);
        initCompassView();
    }

    public CompassView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initCompassView();
    }

    public CompassView(Context context, AttributeSet ats, int defaultStyle) {
        super(context, ats, defaultStyle);
        initCompassView();
    }

    protected void initCompassView() {
        setFocusable(true);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth = measure(widthMeasureSpec);
        int measuredHeight = measure(heightMeasureSpec);

        int d = Math.min(measuredWidth, measuredHeight);

        setMeasuredDimension(d, d);
    }

    private int measure(int measureSpec) {
        int result = 0;

        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        //TODO

        return result;
    }
}
