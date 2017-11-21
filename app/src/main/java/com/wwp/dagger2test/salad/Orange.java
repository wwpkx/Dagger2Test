package com.wwp.dagger2test.salad;

import android.util.Log;

public class Orange {
    Knife knife;
    public Orange(Knife knife){
        this.knife=knife;
        knife.cut();
        Log.e("TAG", "我是一个桔子");
    }
}