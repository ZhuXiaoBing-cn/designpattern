package com.zhu.pattern.decorator;

/**
 * @Classname Chocolate
 * @Description TODO
 * @Date 2020/10/8 19:55
 * @Author by ZhuXiaoBing
 */
public class Chocolate extends CoffeeDecorator{

    public Chocolate(Drink drink) {
        super(drink);
        System.out.println(this.cost());
    }

    @Override
    public String cost() {
        return drink.cost()+ "巧克力 价格：2元 ";
    }

}
