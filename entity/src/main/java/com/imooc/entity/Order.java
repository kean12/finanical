package com.imooc.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.math.BigDecimal;
import java.util.Date;

public class Order {


    private String orderId;

    //渠道id
    private String chanId;

    private String chanUserId;


    private String orderType;

    private String productId;

    private BigDecimal amount;

    private String outerOrderId;

    @Override public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    private String orderStatus;

    private String memo;


    private Date createAt;


    private Date updateAt;


}
