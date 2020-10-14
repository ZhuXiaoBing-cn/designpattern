package com.zhu.pattern.template;

/**
 * @Classname Mian
 * @Description TODO
 * @Date 2020/10/10 7:17
 * @Author by ZhuXiaoBing
 */
public class Mian {

    public static void main(String[] args) {
        Game footballGame = new Football();
        footballGame.play();

        System.out.println("*************************************");

        Game cricketGame = new Cricket();
        cricketGame.play();
    }
}
