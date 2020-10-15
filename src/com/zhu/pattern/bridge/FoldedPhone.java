package com.zhu.pattern.bridge;

/**
 * @Classname FoldedPhone
 * @Description TODO
 * @Date 2020/10/15 8:07
 * @Author by ZhuXiaoBing
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
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
