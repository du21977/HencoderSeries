package com.dobi.practicedraw1;

import android.content.res.Resources;

/**
 * Created by Admin on 2018/7/23.
 */

public class DensityUtitls {

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
