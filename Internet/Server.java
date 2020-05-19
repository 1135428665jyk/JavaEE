package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname Server
 * @Description TODO
 * @Date 2020/5/19 21:06
 * @Created by JYK
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);
        Socket accept = server.accept();
        InputStream inputStream = null;
        OutputStream outputStream = null;
        while (true){
            inputStream = accept.getInputStream();
            byte [] buff = new byte[1024];
            int read = inputStream.read(buff);
            String data = new String(buff, 0, read);
            if (data.equals("exit")){
                break;
            }
            outputStream = accept.getOutputStream();
            outputStream.write(("收到您的消息"+data).getBytes());
            System.out.println(data);
        }
        inputStream.close();
        accept.close();
        server.close();

    }

}
