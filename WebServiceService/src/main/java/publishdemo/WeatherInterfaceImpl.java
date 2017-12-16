package publishdemo;

import javax.jws.WebService;

@WebService
public class WeatherInterfaceImpl implements WeatherInterface{

	public String queryWeather(String cityName) {
		System.out.println("from client..."+cityName);
		String result = "晴";
		return result;
	}
}
