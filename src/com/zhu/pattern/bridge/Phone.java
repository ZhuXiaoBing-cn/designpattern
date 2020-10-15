package com.zhu.pattern.bridge;

/**
 * @Classname Phone
 * @Description TODO
 * @Date 2020/10/15 7:59
 * @Author by ZhuXiaoBing
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        brand.call();
    }


    public void open() {
        brand.open();
    }


    public void close() {
        brand.close();
    }
}
