package com.zhu.pattern.builder;

/**
 * @Classname HouseBuilder
 * @Description TODO
 * @Date 2020/10/13 7:42
 * @Author by ZhuXiaoBing
 */
public abstract class HouseBuilder {
    House house = new House();

    public abstract void buildBaise();
    public abstract void buildWall();
    public abstract void buildRoofed();

    public House buildHouse(){
        return house;
    }

}
