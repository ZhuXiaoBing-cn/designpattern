package com.zhu.pattern.builder;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/10/13 7:53
 * @Author by ZhuXiaoBing
 */
public class Main {
    public static void main(String[] args) {
//        普通房子
//        HouseBuilder houseBuilder = new CommonBuilder();
//        HouseDirector houseDirector = new HouseDirector(houseBuilder);
//        House commonHouse = houseDirector.constructHouse();
//        System.out.println(commonHouse);

//        高楼房子
        HouseBuilder houseBuilder = new HighBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        House commonHouse = houseDirector.constructHouse();
        System.out.println(commonHouse);
    }
}
