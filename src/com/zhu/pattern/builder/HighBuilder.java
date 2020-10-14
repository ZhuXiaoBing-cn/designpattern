package com.zhu.pattern.builder;

/**
 * @Classname HighBuilder
 * @Description TODO
 * @Date 2020/10/13 7:47
 * @Author by ZhuXiaoBing
 */
public class HighBuilder extends HouseBuilder {

    @Override
    public void buildBaise() {
        house.setBaise("高楼房子地基100米");
    }

    @Override
    public void buildWall() {
        house.setWall("高楼房子墙面砌10米");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("高楼房子天窗屋顶");
    }
}
