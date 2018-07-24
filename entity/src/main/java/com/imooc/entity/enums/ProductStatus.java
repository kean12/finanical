package com.imooc.entity.enums;

public enum ProductStatus {

    AUTTING("审核中"), IN_SELL("销售中"),

    LOCKED("暂停销售中"),

    FININISHED("已结束");

    private String desc;

    ProductStatus(String desc) {
        this.desc = desc;
    }

}
