package com.wyk.hellospring.pojo;

import java.util.Date;

/**
 * @author lindongjie
 * @date 2020/7/13 3:45 下午
 * @describe
 **/

public class AccountVO {


    private String id;

    private String userId;

    /**
     * 平台编码
     */
    private String platformCode;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 性别 1男 2女
     */
    private Integer gender;

    /**
     * 婚姻 1 已婚 0 未婚
     */
    private Integer marriage;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 省编码
     */
    private String provinceCode;

    /**
     * 市编码
     */
    private String cityCode;

    /**
     * 区 编码
     */
    private String areaCode;

    /**
     * 地址
     */
    private String address;

    /**
     * 生日
     */
    private Long birthday;

    private Date grantPhoneDate;

    private String customerId;

    private Integer testFlag;
}
