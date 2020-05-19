package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2020/5/19 20:44
 * @Created by JYK
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",10000);
        OutputStream outputStream=null;
        InputStream inputStream = null;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入数据：");
            String data = scanner.nextLine();
            if (data.equals("exit")){
                break;
            }
            outputStream = client.getOutputStream();
            outputStream.write(data.getBytes());
            inputStream = client.getInputStream();
            byte []buff = new byte[1024];
            int length = inputStream.read(buff);
            System.out.println("服务器返回信息："+new String(buff,0,length));
        }
        outputStream.close();
        client.close();
    }
}
