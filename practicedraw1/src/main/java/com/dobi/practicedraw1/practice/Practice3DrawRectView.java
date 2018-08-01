package com.dobi.practicedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.dobi.practicedraw1.DensityUtitls;

public class Practice3DrawRectView extends View {

    private Paint mPaint;
    public Practice3DrawRectView(Context context) {
        this(context,null);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);

       mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形

       // canvas.drawRect(Rect rect,paint);
        //left top  right bottom  左上右下
        canvas.drawRect(getWidth()/2- DensityUtitls.dip2px(60),DensityUtitls.dip2px(60),getWidth()/2+ DensityUtitls.dip2px(60),DensityUtitls.dip2px(180),mPaint);
    }
}
