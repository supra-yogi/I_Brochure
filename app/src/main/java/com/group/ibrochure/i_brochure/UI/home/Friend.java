package com.group.ibrochure.i_brochure.UI.home;

/**
 * Created by KinKin on 11/4/2017.
 */

public class Friend {

    private String name;
    private String desc;

    public Friend(String name, String desc) {
        this.name = name;
        this.desc = desc;
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