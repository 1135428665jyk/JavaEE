public class Client {
    //如果有错误抛出异常
    public static void main(String[] args) throws IOException {
        //向本机的10001端口发出客户请求
        Socket socket = new Socket("localhost",10001);
        //获得对象的输入流
        InputStream inputStream = socket.getInputStream();
        //创建文件的copy.png并获得输出流对象
        OutputStream outputStream = new FileOutputStream("copy.png");
        int temp =0;
        //将输入流的字节流对象，并且将字节流写入文件中
        while ((temp=inputStream.read())!=-1){
            outputStream.write(temp);
        }
        //关闭输出流对象
        outputStream.close();
        //关闭输入流对象
        inputStream.close();
        //关闭socket对象
        socket.close();
    }
}
