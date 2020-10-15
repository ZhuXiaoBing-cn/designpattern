package com.zhu.pattern.bridge;

/**
 * @Classname XiaoMi
 * @Description TODO
 * @Date 2020/10/15 8:03
 * @Author by ZhuXiaoBing
 */
public class XiaoMi implements Brand{

    @Override
    public void call() {
        System.out.println("XiaoMi 手机打电话");
    }

    @Override
    public void open() {
        System.out.println("XiaoMi 手机开机");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi 手机关机");
    }
}
