package com.imooc.entity.enums;

public enum OrderType {



    private String desc;
    OrderType(String desc) {
        this.desc=desc;
    }

    public String getDesc() {return  desc;}


}
