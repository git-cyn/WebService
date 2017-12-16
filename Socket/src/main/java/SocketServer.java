

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description Socket服务端，用来接收客户端请求，实现转大写功能
 * @author Ni Shengwu
 *
 */
public class SocketServer {

    public static void main(String[] args) throws Exception {

        // 1:建立服务器端的tcp socket服务,必须监听一个端口
        ServerSocket ss = new ServerSocket(9999);
        while(true) {
            System.out.println("等待客户端请求……");

            // 2: 通过服务器端的socket对象的accept方法获取连接上的客户端对象，没有则堵塞,等待
            Socket socket = ss.accept();
            System.out.println("握手成功……");

            // 3: 通过输入流获取数据
            InputStream input = socket.getInputStream();
            byte[] b = new byte[1024];
            int len = input.read(b);
            String data = new String(b, 0, len);
            System.out.println("客户端数据为：" + data);

            // 4: 通过服务器端Socket输出流,写数据,会传送到客户端Socket输入流中
            OutputStream out = socket.getOutputStream();
            out.write("ddd".toUpperCase().getBytes());

            // 5: 关闭socket
            out.close();
            input.close();
            socket.close();

        }
    }


}