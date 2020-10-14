package com.zhu.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname College
 * @Description TODO
 * @Date 2020/10/9 8:20
 * @Author by ZhuXiaoBing
 */
public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String desc) {
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
