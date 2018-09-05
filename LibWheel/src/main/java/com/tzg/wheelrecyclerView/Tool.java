package com.tzg.wheelrecyclerView;

import android.content.res.Resources;

/**
 * Description: 常用函数
 * Create by JustTong  2018/9/5
*/

public class Tool {
    /**
     * dp转px
     * @param dp
     */
    public static int dp2px(float dp){
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density + 0.5f);
    }

    /**
     * sp转px
     * @param sp
     * @return
     */
    public static int sp2px(float sp){
        return (int) (sp * Resources.getSystem().getDisplayMetrics().scaledDensity + 0.5f);
    }
}
