package com.zhu.pattern.decorator;

/**
 * @Classname CoffeeDecorator
 * @Description TODO
 * @Date 2020/10/8 19:48
 * @Author by ZhuXiaoBing
 */
public abstract class CoffeeDecorator implements Drink{

    Drink drink;

    public CoffeeDecorator(Drink drink) {
        this.drink = drink;
    }

}
