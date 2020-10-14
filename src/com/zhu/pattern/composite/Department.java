package com.zhu.pattern.composite;

/**
 * @Classname Department
 * @Description TODO
 * @Date 2020/10/9 8:21
 * @Author by ZhuXiaoBing
 */
public class Department extends OrganizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
