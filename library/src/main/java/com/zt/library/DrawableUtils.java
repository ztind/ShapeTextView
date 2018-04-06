package com.zt.library;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

/**
 * Author: ZT on 2018/1/3.
 * 代码实现shpae和selector选择器
 */
public class DrawableUtils {
    //shape
    public static GradientDrawable getGadientDrawabe(int color, int radius){
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(GradientDrawable.RECTANGLE);//矩形
        gradientDrawable.setCornerRadius(radius);//圆角半径
        gradientDrawable.setColor(color);

        return gradientDrawable;
    }
    //selector press
    private static StateListDrawable getSelector(GradientDrawable normal, GradientDrawable press){
        StateListDrawable stateListDrawable = new StateListDrawable();

        //按下状态
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed},press);
        //正常状态
        stateListDrawable.addState(new int[]{},normal);

        return stateListDrawable;
    }


    public static StateListDrawable getSelector(int normalColor, int pressColor, int radius){

        GradientDrawable normal = getGadientDrawabe(normalColor, radius);
        GradientDrawable press = getGadientDrawabe(pressColor, radius);

        return getSelector(normal, press);
    }


}
