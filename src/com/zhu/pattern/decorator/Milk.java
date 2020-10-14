package com.zhu.pattern.decorator;

/**
 * @Classname Milk
 * @Description TODO
 * @Date 2020/10/8 19:53
 * @Author by ZhuXiaoBing
 */
public class Milk extends CoffeeDecorator{

    public Milk(Drink drink) {
        super(drink);
        System.out.println(this.cost());
    }

    @Override
    public String cost() {
        return drink.cost()+ " 牛奶 价格：1元 ";
    }

}
