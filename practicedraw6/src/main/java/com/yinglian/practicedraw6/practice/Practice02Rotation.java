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
 * 属性动画旋转练习
 */
public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    private int rotationState =0;
    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
                
                switch(rotationState){
                    case 0 :
                        rotationState++;
                        imageView.animate().rotation(180);
                        break;
                    case 1 :
                        rotationState++;
                        imageView.animate().rotation(0);
                        break;
                    case 2 :
                        rotationState++;
                        imageView.animate().rotationX(180);
                        break;
                    case 3 :
                        rotationState++;
                        imageView.animate().rotationX(0);
                        break;
                    case 4 :
                        rotationState++;
                        imageView.animate().rotationY(180);
                        break;
                    case 5 :
                        rotationState=0;
                        imageView.animate().rotationY(0);
                        break;
                    
                }
            }
        });
    }
}