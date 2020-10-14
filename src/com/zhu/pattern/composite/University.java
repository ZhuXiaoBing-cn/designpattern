package com.zhu.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname University
 * @Description TODO
 * @Date 2020/10/9 8:13
 * @Author by ZhuXiaoBing
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}
