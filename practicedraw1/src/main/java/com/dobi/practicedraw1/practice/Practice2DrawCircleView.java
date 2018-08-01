package com.dobi.practicedraw1.practice;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private  Paint  mPaint;

    public Practice2DrawCircleView(Context context) {
        this(context,null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL); //实心
        mPaint.setAntiAlias(true);//抗锯齿


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        canvas.drawCircle(getWidth()/2 -dip2px(60),100,100,mPaint);

        mPaint.setStyle(Paint.Style.STROKE); //空心
        canvas.drawCircle(getWidth()/2 +dip2px(60),100,100,mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(getWidth()/2 - dip2px(60),getHeight()/2 +dip2px(60),100,mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE); //空心
        mPaint.setStrokeWidth(20);//线条为20个像素
        canvas.drawCircle(getWidth()/2+dip2px(60),getHeight()/2+dip2px(60),100,mPaint);
    }


    public static int px2dip(int pxValue)
    {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


    public static float dip2px(float dipValue)
    {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return  (dipValue * scale + 0.5f);
    }
}
