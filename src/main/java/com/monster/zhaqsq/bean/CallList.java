package com.monster.zhaqsq.bean;

import java.util.Date;

public class CallList {
    private Integer callId;

    private Integer subId;

    private Date subTime;

    private Date endTime;

    private String callTitle;

    private String callDesp;

    private Integer callMoney;

    private String callNow;

    private Integer recId;

    private String subName;

    private String recName;

    public Integer getCallId() {
        return callId;
    }

    public void setCallId(Integer callId) {
        this.callId = callId;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Date getSubTime() {
        return subTime;
    }

    public void setSubTime(Date subTime) {
        this.subTime = subTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCallTitle() {
        return callTitle;
    }

    public void setCallTitle(String callTitle) {
        this.callTitle = callTitle == null ? null : callTitle.trim();
    }

    public String getCallDesp() {
        return callDesp;
    }

    public void setCallDesp(String callDesp) {
        this.callDesp = callDesp == null ? null : callDesp.trim();
    }

    public Integer getCallMoney() {
        return callMoney;
    }

    public void setCallMoney(Integer callMoney) {
        this.callMoney = callMoney;
    }

    public String getCallNow() {
        return callNow;
    }

    public void setCallNow(String callNow) {
        this.callNow = callNow == null ? null : callNow.trim();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }
}