package com.wwp.dagger2test.salad;

import android.util.Log;

import javax.inject.Inject;

public class Salad {
    @Inject
    Banana banana;

    @Inject
    Pear pear;

    @Inject
    SaladSauce saladSauce;

    @Inject
    Orange orange;  //用到了Knife对象

    //注入小刀（如果你想使用小刀对象，这里要注入小刀，否则不用注入）
    //此处的对象是新建的，和orange中的对象不是一个
    @Inject
    Knife knife;

    @Inject
    @Type("normal")
    Apple normalApple;

    @Inject
    @Type("color")
    Apple colorApple;

    @Inject
    Color color;

    public Salad() {
        // DaggerSaladComponent编译时才会产生这个类
        //将saladComponent所连接的SaladModule中管理的依赖注入本类中
        //DaggerSaladComponent.create().inject(this);
        DaggerSaladComponent.builder().saladModule(new SaladModule()).build().inject(this);

        makeSalad(pear, banana, saladSauce);
    }

    private void makeSalad(Pear pear, Banana banana, SaladSauce saladSauce) {
        Log.e("TAG", "我在搅拌制作水果沙拉");
    }
}