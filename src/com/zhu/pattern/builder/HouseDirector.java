package com.zhu.pattern.builder;

/**
 * @Classname HouseDirector
 * @Description TODO
 * @Date 2020/10/13 7:49
 * @Author by ZhuXiaoBing
 */
public class HouseDirector {

    private HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBaise();
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        return houseBuilder.buildHouse();
    }


}
