天气查询微服务
=============================

# 微服务简介
该服务主要是通过天气服务接口，获取昨天，未来五天（包含今天）的天气信息，然后返回JSON格式数据。

## 服务接口说明
### 接口地址
- http://host:port/weather/cityId/{cityId}
    其中，cityId中以通过 http://mobile.weather.com.cn/js/citylist.xml 获取
- http://host:port/weather/cityName?cityName={cityName}
    其中，`cityName` 城市名

### 接口返回数据
- JSON数据
```json
{
    "data": {
    "city": "深圳",
    "aqi": "115",
    "wendu": "33",
    "ganmao": "各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。",
    "yesterday": {
        "date": "16日星期六",
        "high": "高温 33℃",
        "fx": "无持续风向",
        "low": "低温 28℃",
        "fl": "<![CDATA[<3级]]>",
        "type": "多云"
    },
    "forecast": [
        {
            "date": "17日星期天",
            "high": "高温 34℃",
            "fengxiang": "无持续风向",
            "low": "低温 28℃",
            "fengli": "<![CDATA[<3级]]>",
            "type": "多云"
        },
        {
            "date": "18日星期一",
            "high": "高温 34℃",
            "fengxiang": "无持续风向",
            "low": "低温 27℃",
            "fengli": "<![CDATA[<3级]]>",
            "type": "多云"
        },
        {
            "date": "19日星期二",
            "high": "高温 33℃",
            "fengxiang": "无持续风向",
            "low": "低温 26℃",
            "fengli": "<![CDATA[<3级]]>",
            "type": "阵雨"
        },
        {
            "date": "20日星期三",
            "high": "高温 32℃",
            "fengxiang": "无持续风向",
            "low": "低温 26℃",
            "fengli": "<![CDATA[<3级]]>",
            "type": "阵雨"
        },
        {
            "date": "21日星期四",
            "high": "高温 32℃",
            "fengxiang": "无持续风向",
            "low": "低温 26℃",
            "fengli": "<![CDATA[<3级]]>",
            "type": "阵雨"
        }
    ]
},
"status": "1000",
"desc": "OK"
}
```

- 返回字段说明：
    - `city` -> 城市名称
    - `aqi` -> 空气指数
    - `wendu` -> 实时温度
    - `ganmao` -> 感冒指数
    - `yesterday` -> 昨天天气
    - `forecast` -> 未来天气（包含今天）
    - `status` -> 状态码，当状态码为100时，则为成功，其他为失败
    - `desc` -> 状态描述，OK为成功

## 作者
yueli.liao
