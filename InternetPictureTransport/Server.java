public class Server {
    //有错误的话抛出异常
    public static void main(String[] args) throws IOException {
        //服务器监听端口1001
        ServerSocket server = new ServerSocket(10001);
        //请求来自产生一个socket对象，并继续执行
        Socket socket = server.accept();
        //获得socket的输出流对象
        OutputStream outputStream1 = socket.getOutputStream();
        //读取本地文件的字节流
        FileInputStream inputStream = new FileInputStream("C:\\Users\\JYK\\Desktop\\InternetDemo\\pic.png");
        int length = 0;
        //将图片文件写出到输出流中
        while ((length=inputStream.read())!=-1){
            outputStream1.write(length);
        }
        //输入流关闭
        inputStream.close();
        //输出流关闭
        outputStream1.close();
        //关闭Socket
        socket.close();
        //关闭Serversocket
        server.close();
    }
}
