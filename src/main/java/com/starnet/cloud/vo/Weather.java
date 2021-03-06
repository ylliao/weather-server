package com.starnet.cloud.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 天气信息类
 *
 * @author yueli.liao
 * @create 2017-09-07
 * @version 1.0
 */
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city; // 城市名称
    private String aqi; // 空气指数
    private String wendu; // 实时温度
    private String ganmao; // 感冒指数
    private Yesterday yesterday; // 昨天天气
    private List<Forecast> forecast; // 未来天气

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

}
