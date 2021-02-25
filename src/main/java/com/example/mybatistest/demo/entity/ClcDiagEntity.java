package com.example.mybatistest.demo.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author chuzhiqiang
 * @Version 1.0.0
 * @date 2020-11-24
 * @description 诊断表
 */
@Data
public class ClcDiagEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 医院编码
     */
    private String hosnum;

    /**
     * 诊断id
     */
    private String diagid;

    /**
     * 门诊就诊id
     */
    private String dtmainid;

    /**
     * 相关单据号
     */
    private String rsheetno;

    /**
     * 诊断编码
     */
    private String diagno;

    /**
     * 诊断名称
     */
    private String diagname;

    /**
     * 科室编码
     */
    private String deptcode;

    /**
     * 科室名称
     */
    private String deptname;

    /**
     * 医生id
     */
    private String doctorid;

    /**
     * 医生姓名
     */
    private String doctorname;

    /**
     * 诊断类别
     */
    private String diagtype;

    /**
     * 诊断级别
     */
    private String diagclass;

    /**
     * 确诊状态
     */
    private String surestatus;

    /**
     * 中医标记
     */
    private String cmedflag;

    /**
     * 诊断日期
     */
    private Date diagdate;

    /**
     * 备注
     */
    private String comments;

    /**
     * 院区编码
     */
    private String nodecode;

    /**
     * 发病日期
     */
    private Date begindate;

    /**
     * 诊断icd10编码
     */
    private String icd10;

    /**
     * 关联诊断id
     */
    private String refId;

    /**
     * 病情
     */
    private String condition;

    /**
     * 序号
     */
    private String sn;

    /**
     * 部位
     */
    private String position;

    /**
     * 中医证型编码
     */
    private String syndromeNo;

    /**
     * 中医证型名称
     */
    private String syndromeName;

    /**
     * 日志
     */
    private Date tracelog;

    /**
     * 更新时间
     */
    private Date updateTime;

    public ClcDiagEntity() {
    }

}
