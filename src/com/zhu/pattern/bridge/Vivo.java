package com.zhu.pattern.bridge;

/**
 * @Classname Vivo
 * @Description TODO
 * @Date 2020/10/15 8:03
 * @Author by ZhuXiaoBing
 */
public class Vivo implements Brand{

    @Override
    public void call() {
        System.out.println("Vivo 手机打电话");
    }

    @Override
    public void open() {
        System.out.println("Vivo 手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo 手机关机");
    }
}
