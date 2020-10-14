package com.zhu.pattern.template;

/**
 * @Classname Football
 * @Description TODO
 * @Date 2020/10/10 7:27
 * @Author by ZhuXiaoBing
 */
public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("初始化游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始踢球游戏");
    }

    @Override
    void endPlay() {
        System.out.println("结束踢球游戏");
    }
}
