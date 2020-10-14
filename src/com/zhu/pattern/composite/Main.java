package com.zhu.pattern.composite;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/10/9 8:25
 * @Author by ZhuXiaoBing
 */
public class Main {

    public static void main(String[] args) {

        OrganizationComponent university = new University("清华大学","清华大学");

        OrganizationComponent jisuanji = new College("计算机学院","计算机学院");
        OrganizationComponent tongxin = new College("通信学院","通信学院");

        OrganizationComponent jisaunjizhuanye = new Department("计算机专业","计算机专业");
        OrganizationComponent ruanjianzhuanye = new Department("软件专业","软件专业");

        OrganizationComponent tongxinzhuanye = new Department("通信专业","通信专业");
        OrganizationComponent xinxizhuanye = new Department("信息专业","信息专业");


        jisuanji.add(jisaunjizhuanye);
        jisuanji.add(ruanjianzhuanye);

        tongxin.add(tongxinzhuanye);
        tongxin.add(xinxizhuanye);

        university.add(jisuanji);
        university.add(tongxin);

        university.print();

    }
}
