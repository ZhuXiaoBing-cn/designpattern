package com.zhu.pattern.bridge;

/**
 * @Classname UpRigthPhone
 * @Description TODO
 * @Date 2020/10/15 8:08
 * @Author by ZhuXiaoBing
 */
public class UpRigthPhone extends Phone{

    public UpRigthPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void close() {
        super.close();
    }
}
