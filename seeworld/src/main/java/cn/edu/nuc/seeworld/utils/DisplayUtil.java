package cn.edu.nuc.seeworld.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by lenovo on 2015/9/20.
 */
public class DisplayUtil {

    /**
     * 将px值转化为dp值，保证尺寸大小不变
     * @param context
     * @param pxValue
     * @return
     */
    public static int px2dip(Context context,float pxValue){
        final float scale=context.getResources().getDisplayMetrics().density;
        return (int) (pxValue/scale+0.5f);

    }

    /**
     * 将dip或dp值转化为px值，保证尺寸大小不变
     * @param context
     * @param dipValue
     * @return
     */
    public static int dip2px(Context context,float dipValue){
        final float scale=context.getResources().getDisplayMetrics().density;
        return (int)(dipValue*scale+0.5f);
    }

    /**
     * 将px转化为sp值，保证文字大小不变
     * @param context
     * @param pxValue
     * @return
     */
    public static  int px2sp(Context context,float pxValue){
        final  float fontScale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue/fontScale+0.5f);
    }

    /**
     * 将sp值转化为px值，保证文字大小不变
     * @param context
     * @param spValue
     * @return
     */
    public static int sp2px(Context context,float spValue){
        final  float fontScale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue*fontScale+0.5f);
    }
//    public static int dp2px(int dp){
//        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,)
//    }
}
