package com.dobi.practicedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.dobi.practicedraw1.DensityUtitls;

public class Practice7DrawRoundRectView extends View {

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形

        Paint mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        //1-4参数----左上右下
        //第五个和第六个参数 是圆角的半径
        canvas.drawRoundRect(getWidth()/2- DensityUtitls.dip2px(60),getHeight()/2-DensityUtitls.dip2px(30)
                            ,getWidth()/2+DensityUtitls.dip2px(60),getHeight()/2+DensityUtitls.dip2px(30),20,20,mPaint);
    }
}
