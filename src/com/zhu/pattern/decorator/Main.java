package com.zhu.pattern.decorator;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/10/8 19:47
 * @Author by ZhuXiaoBing
 */
public class Main {

    public static void main(String[] args) {

        Drink drink = new LongCoffee();

        Drink drink1 = new Milk(drink);

        Drink drink2 = new Chocolate(drink1);

        Drink drink3 = new Chocolate(drink2);

        Drink drink4 = new Soy(drink3);
         

    }
}
