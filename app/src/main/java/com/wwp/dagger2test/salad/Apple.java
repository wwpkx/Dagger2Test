package com.wwp.dagger2test.salad;

import android.util.Log;

public class Apple {
    Color color;

    public Apple() {
        Log.e("TAG", "我是一个普通的苹果");
    }

    public Apple(Color color) {
        this.color = color;
        Log.e("TAG", "我是一个有颜色的苹果");
    }
}