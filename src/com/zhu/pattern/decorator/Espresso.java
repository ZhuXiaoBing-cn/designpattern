package com.zhu.pattern.decorator;

/**
 * @Classname Espresso
 * @Description TODO
 * @Date 2020/10/8 19:32
 * @Author by ZhuXiaoBing
 */
public class Espresso extends Coffee{

    public Espresso() {
        System.out.println(this.cost());
    }

    @Override
    public String cost() {
       return "浓缩咖啡 价格：5元";
    }
}
