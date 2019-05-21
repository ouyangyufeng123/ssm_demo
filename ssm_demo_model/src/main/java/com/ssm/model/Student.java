package com.ssm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "用户表实体", description = "实体类")
public class Student implements Serializable, Cloneable{

    @ApiModelProperty(value = "学生id")
    private Long sid;

    @ApiModelProperty(value = "学生姓名")
    private String sname;

    @ApiModelProperty(value = "学生年龄")
    private Integer sage;

}