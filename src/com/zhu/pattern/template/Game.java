package com.zhu.pattern.template;

/**
 * @Classname Game
 * @Description TODO
 * @Date 2020/10/10 7:23
 * @Author by ZhuXiaoBing
 */
public abstract class Game {

    protected final void play(){
        this.initialize();
        this.startPlay();
        this.endPlay();
    }

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

}
