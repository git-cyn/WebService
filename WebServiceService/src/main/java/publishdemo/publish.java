package publishdemo;

import javax.xml.ws.Endpoint;

public class publish {

	public static void main(String[] args) {
		
		Endpoint.publish("http://127.0.0.1:54321/weather", new WeatherInterfaceImpl());
		System.out.println("qidong");
	}
}
