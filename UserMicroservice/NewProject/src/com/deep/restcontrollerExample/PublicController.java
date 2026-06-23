package com.deep.restcontrollerExample;

public class PublicController {

    private  HomeClass homeClass;


    //setter injection


    public void setHomeClass(HomeClass homeClass) {
        this.homeClass = homeClass;
    }
}