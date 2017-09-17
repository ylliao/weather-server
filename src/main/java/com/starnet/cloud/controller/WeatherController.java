package com.starnet.cloud.controller;

import com.starnet.cloud.service.WeatherDataService;
import com.starnet.cloud.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 天气服务入口
 *
 * @author yueli.liao
 * @create 2017-09-07
 * @version 1.0
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @RequestMapping("/cityId/{cityId}")
    public Response getReportByCityId(@PathVariable("cityId") String cityId) {
        try {
            return weatherDataService.getDataByCityId(cityId);
        } catch (Exception e) {
            Response response = new Response();
            response.setStatus("0000");
            response.setDesc("接口异常，请稍后重试");
            return response;
        }
    }

    @RequestMapping("/cityName")
    public Response getReportByCityName(HttpServletRequest request) {
        try {
            String cityName = request.getParameter("cityName");
            return weatherDataService.getDataByCityName(cityName);
        } catch (Exception e) {
            Response response = new Response();
            response.setStatus("0000");
            response.setDesc("接口异常，请稍后重试");
            return response;
        }
    }

}
