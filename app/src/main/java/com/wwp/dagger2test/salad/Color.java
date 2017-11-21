package com.wwp.dagger2test.salad;

import android.util.Log;

public class Color {
    String color;

    public Color() {
        Log.e("TAG", "我是一个颜色");
    }

    public Color(String color) {
        this.color = color;
        Log.e("TAG", "我是一个有颜色：" + color);
    }
}