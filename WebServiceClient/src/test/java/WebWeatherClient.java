

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

import java.util.List;

/**
 * Created by admin on 2017/12/7.
 */
public class WebWeatherClient {

    public static void main(String[] args){


        //创建服务视图
        WeatherWS weatherWebService = new WeatherWS();
        //通过服务视图得到服务端点
        //      WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
        //通过服务端点调用服务方法
        //        ArrayOfString arrayOfString = weatherWebServiceSoap.getWeatherbyCityName("北京");

        WeatherWSSoap weatherWSSoap = weatherWebService.getWeatherWSSoap();
        ArrayOfString arrayOfString = weatherWSSoap.getWeather("上海",null);
        List<String> result = arrayOfString.getString();
        for(int i=0;i<result.size();i++) {
            System.out.println(result.get(i));
        }
    }
}
