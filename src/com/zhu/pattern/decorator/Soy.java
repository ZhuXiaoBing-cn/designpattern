package com.zhu.pattern.decorator;

/**
 * @Classname Soy
 * @Description TODO
 * @Date 2020/10/8 19:50
 * @Author by ZhuXiaoBing
 */
public class Soy extends CoffeeDecorator  {


    public Soy(Drink drink) {
        super(drink);
        System.out.println(this.cost());
    }

    @Override
    public String cost() {
        return drink.cost()+ "大豆油 价格：3元 ";
    }
}
