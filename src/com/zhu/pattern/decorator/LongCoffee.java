package com.zhu.pattern.decorator;

/**
 * @Classname LongCoffee
 * @Description TODO
 * @Date 2020/10/8 19:32
 * @Author by ZhuXiaoBing
 */
public class LongCoffee extends Coffee{

    public LongCoffee() {
        System.out.println(this.cost());
    }

    @Override
    public String cost() {
        return "美国咖啡 价格：3元";
    }
}
