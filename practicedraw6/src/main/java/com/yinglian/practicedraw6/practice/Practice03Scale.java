package com.yinglian.practicedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.yinglian.practicedraw6.R;

/**
 * 属性动画缩放练习
 */
public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    private int scaleState = 0;
    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().scaleX/Y() 来让 View 放缩

                switch(scaleState){
                    case 0:
                        scaleState++;
                        imageView.animate().scaleX(1.5f);
                        break;
                    case 1:
                        scaleState++;
                        imageView.animate().scaleX(1f);
                        break;
                    case 2:
                        scaleState++;
                        imageView.animate().scaleY(0.5f);
                        break;
                    case 3:
                        scaleState=0;
                        imageView.animate().scaleY(1f);
                        break;

                }
            }
        });
    }
}
