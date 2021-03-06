package com.yinglian.practicedraw6.practice;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


import com.yinglian.practicedraw6.R;
import com.yinglian.practicedraw6.Utils;

import static android.os.Build.VERSION.SDK_INT;
import static com.yinglian.practicedraw6.Utils.dpToPixel;

/**
 * 属性动画平移练习
 */
public class Practice01Translation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    private int whitch = 0;//执行哪一个动画
    public Practice01Translation(Context context) {
        super(context);
    }

    public Practice01Translation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01Translation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        if (SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            // 给音乐图标加上合适的阴影
            imageView.setOutlineProvider(new MusicOutlineProvider());
        }

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().translationX/Y/Z() 来让 View 平移

                switch (whitch){
                    case 0 :
                        imageView.animate().translationX(Utils.dpToPixel(100));
                        whitch++;
                        break;
                    case 1 :
                        imageView.animate().translationX(0);
                        whitch++;
                        break;
                    case 2 :
                        imageView.animate().translationY(Utils.dpToPixel(50));
                        whitch++;
                        break;
                    case 3 :
                        imageView.animate().translationY(0);
                        whitch++;
                        break;
                    case 4 :
                        whitch++;
                        imageView.animate().translationZ(Utils.dpToPixel(20));
                        break;
                    case 5 :
                        imageView.animate().translationZ(0);
                        whitch=0;
                        break;
                }
            }
        });
    }

    /**
     * 为音乐图标设置三角形的 Outline。
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    class MusicOutlineProvider extends ViewOutlineProvider {
        Path path = new Path();

        {
            path.moveTo(0, dpToPixel(10));
            path.lineTo(dpToPixel(7), dpToPixel(2));
            path.lineTo(dpToPixel(116), dpToPixel(58));
            path.lineTo(dpToPixel(116), dpToPixel(70));
            path.lineTo(dpToPixel(7), dpToPixel(128));
            path.lineTo(0, dpToPixel(120));
            path.close();
        }

        @Override
        public void getOutline(View view, Outline outline) {
            outline.setConvexPath(path);
        }
    }
}