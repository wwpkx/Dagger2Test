package com.wwp.dagger2test.salad;

import dagger.Module;
import dagger.Provides;

@Module
public class SaladModule {
    @Provides
    public Pear providePear() {
        return new Pear();
    }

    @Provides
    public Banana provideBanana() {
        return new Banana();
    }

    @Provides
    public SaladSauce provideSaladSauce() {
        return new SaladSauce();
    }

    @Provides
    public Orange provideOrange(Knife knife) {
        return new Orange(knife);
    }

    @Provides
    public Knife provideKnife() {
        return new Knife();
    }

    @Type("normal")
    @Provides
    public Apple provideNormalApple() {
        return new Apple();
    }

    @Type("color")
    @Provides
    public Apple provideColorApple(Color color) {
        return new Apple(color);
    }

    @Provides
    public Color provideColor(){
        return new Color("red");
    }
}