package com.example555.demo.controller;

import lombok.Data;


@Data
public class Request {


    public Integer getUserCompanyId() {
        return userCompanyId;
    }

    public void setUserCompanyId(Integer userCompanyId) {
        this.userCompanyId = userCompanyId;
    }

    //  @ApiModelProperty("设备所属公司ID")
  private Integer userCompanyId;



    private Integer id;

    private Integer price;

    private String name;

}
