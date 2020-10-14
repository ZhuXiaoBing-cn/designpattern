package com.zhu.pattern.template;

/**
 * @Classname Cricket
 * @Description TODO
 * @Date 2020/10/10 7:27
 * @Author by ZhuXiaoBing
 */
public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("初始化游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始板球游戏");
    }

    @Override
    void endPlay() {
        System.out.println("结束板球游戏");
    }
}
