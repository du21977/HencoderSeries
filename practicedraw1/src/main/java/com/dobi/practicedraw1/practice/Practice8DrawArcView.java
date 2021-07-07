package com.dobi.practicedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.dobi.practicedraw1.DensityUtitls;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);

        //1-4参数左上右下
        // 第5个参数为起始角度的位置 ，第六个参数为绘制的的角度数，第七个参数是是否连接到圆心
        canvas.drawArc(getWidth()/2- DensityUtitls.dip2px(60),getHeight()/2-DensityUtitls.dip2px(40),getWidth()/2+DensityUtitls.dip2px(60),getHeight()/2+DensityUtitls.dip2px(40)
                        ,-100,100,true,mPaint);//封口就是扇形


        //第6个参数是需要绘制多少角度，不是到哪个角度---------------绘制方向顺时针

        //x正方向为0度角位置  ，顺时针为正角度方向，逆时针为负角度方向
        canvas.drawArc(getWidth()/2- DensityUtitls.dip2px(60),getHeight()/2-DensityUtitls.dip2px(40),getWidth()/2+DensityUtitls.dip2px(60),getHeight()/2+DensityUtitls.dip2px(40)
                ,20,140,false,mPaint);   //下面的圆弧

        mPaint.setStyle(Paint.Style.STROKE);

        canvas.drawArc(getWidth()/2- DensityUtitls.dip2px(60),getHeight()/2-DensityUtitls.dip2px(40),getWidth()/2+DensityUtitls.dip2px(60),getHeight()/2+DensityUtitls.dip2px(40)
                ,180,60,false,mPaint); //弧线不封口


    }
}
