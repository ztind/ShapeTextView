package com.zt.library;
import android.content.Context;
/**
 * Author: ZT on 2018/1/3.
 */
public class UIUtils {
    public static float px2dp(Context context,int px){
        float density = context.getResources().getDisplayMetrics().density;//设备密度
        float dp = px / density;
        return dp;
    }
    public static int dp2px(Context context,float dp){
        float density = context.getResources().getDisplayMetrics().density;
        int px = (int) (dp * density+0.5f);
        return px;
    }
}
