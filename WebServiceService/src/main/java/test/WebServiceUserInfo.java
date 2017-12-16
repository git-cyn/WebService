package test;


import javax.xml.ws.Endpoint;

public class WebServiceUserInfo {
	public WebServiceUserInfo(){
//		//create a factory for create a web service interface
//		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
//
//		//release the web service
//		factory.setAddress("http://localhost:8089/userinfoservice");
//
//		//register the web service
//		factory.setServiceClass(UserService.class);
//		factory.setServiceBean(new UserServiceImpl());
//
//		factory.create();
		
//		another method to release the web service
		Endpoint.publish("http://localhost:8080/userinfoservice", new UserServiceImpl());
	}
	
	public static void main(String[] args) {
		new WebServiceUserInfo();
		 System.out.println("Server ready...");     
	        try {  
	            Thread.sleep(1000*300);//休眠五分分钟，便于测试     
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }     
	        System.out.println("Server exit...");     
	        System.exit(0);  
	}
}