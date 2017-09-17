package com.starnet.cloud.service;

import com.starnet.cloud.vo.Response;

import java.io.IOException;

/**
 * 天气服务接口
 *
 * @author yueli.liao
 * @create 2017-09-07
 * @version 1.0
 */
public interface WeatherDataService {

    /**
     * 根据城市ID查询天气数据
     *
     * @param cityId
     * @return
     */
    Response getDataByCityId(String cityId) throws IOException;

    /**
     * 根据城市名称查询天气数据
     *
     * @param cityName
     * @return
     */
    Response getDataByCityName(String cityName) throws IOException;
}
