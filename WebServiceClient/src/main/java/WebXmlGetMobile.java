import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * Created by admin on 2017/12/10.
 */
public class WebXmlGetMobile {
    /**
     * @param number
     * @throws Exception
     * @Description get方式请求
     */
    public static void get(String number) throws Exception {
        //HttpClient：在java代码中模拟Http请求
        // 创建浏览器对象
        HttpClient client = new HttpClient();
        // 填写数据，发送get或者post请求
        GetMethod get = new GetMethod("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx" +
                "/getMobileCodeInfo?mobileCode=" + number + "&userID="+" ");
        // 指定传输的格式为get请求格式
        get.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
        // 发送请求
        int code = client.executeMethod(get);
        System.out.println("Http:状态码为：" + code);

        String result = get.getResponseBodyAsString();
        System.out.println("返回的结果为：" + result);
    }

    public static void main(String[] args) {
        try {
            get("15261115811");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
