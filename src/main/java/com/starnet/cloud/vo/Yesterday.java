package com.starnet.cloud.vo;

import java.io.Serializable;

/**
 * 昨日天气信息类
 *
 * @author yueli.liao
 * @create 2017-09-07
 * @version 1.0
 */
public class Yesterday implements Serializable {

    private static final long serialVersionUID = 1L;

    private String date; // 日期，格式：x日星期x
    private String high; // 最高温度
    private String fx; // 风向
    private String low; // 最低温度
    private String fl; // 风力
    private String type; // 天气类型，如晴、多云，小雨等

    public Yesterday() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
