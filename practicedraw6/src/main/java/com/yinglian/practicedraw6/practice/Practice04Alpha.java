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
 * 属性动画透明度练习
 */

public class Practice04Alpha extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    private int alphaState =0;
    public Practice04Alpha(Context context) {
        super(context);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().alpha() 来改变 View 的透明度
                switch (alphaState){
                    case 0:
                        alphaState++;
                        imageView.animate().alpha(0f);
                        break;
                    case 1:
                        imageView.animate().alpha(1f);
                        alphaState++;
                        break;
                    case 2:
                        alphaState++;
                        imageView.animate().alpha(0.5f);
                        break;
                    case 3:
                        imageView.animate().alpha(1f);
                        alphaState=0;
                        break;

                }
            }
        });
    }
}