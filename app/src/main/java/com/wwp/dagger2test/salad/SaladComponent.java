package com.wwp.dagger2test.salad;

import dagger.Component;

@Component(modules = {SaladModule.class})
public interface SaladComponent {



    //注意：下面的这个方法，表示要将以上的三个依赖注入到某个类中
    void inject(Salad salad);
}