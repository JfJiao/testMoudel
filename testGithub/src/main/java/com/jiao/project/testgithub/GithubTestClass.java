package com.jiao.project.testgithub;

import android.content.Context;
import android.widget.Toast;

public
/**
 * @author： jiaojunfeng
 * @date： 4/28/21
 * @describe：
 */
class GithubTestClass {
    public void toastMethod(Context context) {
        Toast.makeText(context, "toastMethod 被调用", Toast.LENGTH_SHORT).show();
    }

    /**
     * 开平方
     * @param number
     * @return
     */
    public double sqrt(double number) {
      return  Math.sqrt(number);
    }
}
