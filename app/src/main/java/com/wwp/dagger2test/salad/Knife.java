package com.wwp.dagger2test.salad;

import android.util.Log;

public class Knife {
    public Knife() {
        Log.e("TAG", "我是一个小刀" + this);
    }

    public void cut() {
        Log.e("TAG", "我可以切水果");
    }
}