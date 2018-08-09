package com.hencoder.hencoderpracticelayout1.sample;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;


public class Sample01SquareImageView extends ImageView {
    public Sample01SquareImageView(Context context) {
        super(context);
    }

    public Sample01SquareImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Sample01SquareImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);//必须要这个才能得到测量大小getMeasuredWidth();


        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();

        Log.e("onMeasure-measuredWidth",measuredWidth+"   0");
        Log.e("onMeasure-meauredHeight",measuredHeight+"   0");

        if (measuredWidth > measuredHeight) {
            measuredWidth = measuredHeight;
        } else {
            measuredHeight = measuredWidth;
        }

        setMeasuredDimension(measuredWidth, measuredHeight);


        /*
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        Log.e("onMeasure-width",width+"   0");
        Log.e("onMeasure-height",height+"   0");
        if (width > height) {
            width = height;
        } else {
            height = width;
        }
        setMeasuredDimension(width,height);
        */
    }
}
