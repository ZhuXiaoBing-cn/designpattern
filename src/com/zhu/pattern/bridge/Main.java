package com.zhu.pattern.bridge;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/10/15 7:48
 * @Author by ZhuXiaoBing
 */
public class Main {

    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();

        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
