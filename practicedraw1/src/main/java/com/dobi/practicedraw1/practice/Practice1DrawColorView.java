package com.dobi.practicedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice1DrawColorView extends View {

    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);//父类的onDraw里面啥都没做，空方法，我们来重写，实现我们想要绘制的效果

//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW

       // canvas.drawColor(Color.parseColor("#"));
       // canvas.drawColor(Color.YELLOW);
//        canvas.drawRGB(255,0,0);//绘制红色
        canvas.drawARGB(10,255,0,0);//绘制红色
    }
}
