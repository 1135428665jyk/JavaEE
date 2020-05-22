public class Server {
    //有错误的话抛出异常
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10001);
        Socket socket = server.accept();
        OutputStream outputStream1 = socket.getOutputStream();
        FileInputStream inputStream = new FileInputStream("C:\\Users\\JYK\\Desktop\\InternetDemo\\pic.png");
        int length = 0;
        while ((length=inputStream.read())!=-1){
            outputStream1.write(length);
        }
        inputStream.close();
        outputStream1.close();
        socket.close();
        server.close();
    }
}
