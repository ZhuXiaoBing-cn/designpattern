package com.zhu.pattern.composite;

/**
 * @Classname OrganizationComponent
 * @Description TODO
 * @Date 2020/10/9 8:09
 * @Author by ZhuXiaoBing
 */
public abstract class OrganizationComponent {

    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    protected abstract void print();

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
