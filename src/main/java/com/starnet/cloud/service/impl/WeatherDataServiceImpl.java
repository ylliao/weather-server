package com.starnet.cloud.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starnet.cloud.service.WeatherDataService;
import com.starnet.cloud.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * 天气服务接口实现
 *
 * @author yueli.liao
 * @create 2017-09-07
 * @version 1.0
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private RestTemplate restTemplate;

    // 获取配置文件中信息
    @Value("${weather.api}")
    private String weatherApi;

    @Override
    public Response getDataByCityId(String cityId) throws IOException {
        String uri = weatherApi + "?citykey=" + cityId;
        return this.doGetWeatherData(uri);
    }

    @Override
    public Response getDataByCityName(String cityName) throws IOException {
        String uri = weatherApi + "?city=" + cityName;
        return this.doGetWeatherData(uri);
    }

    private Response doGetWeatherData(String uri) throws IOException {
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        String strBody = null;
        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }
        // 将JSON字符串反序列化为响应对象
        ObjectMapper mapper = new ObjectMapper();
        Response weather = mapper.readValue(strBody, Response.class);

        return weather;
    }

}
