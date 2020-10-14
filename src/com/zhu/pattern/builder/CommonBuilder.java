package com.zhu.pattern.builder;

/**
 * @Classname CommonBuilder
 * @Description TODO
 * @Date 2020/10/13 7:45
 * @Author by ZhuXiaoBing
 */
public class CommonBuilder extends HouseBuilder {


    @Override
    public void buildBaise() {
        house.setBaise("普通房子地基5米");
    }

    @Override
    public void buildWall() {
        house.setWall("普通房子墙面砌5cm");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("普通房子屋顶");
    }
}
