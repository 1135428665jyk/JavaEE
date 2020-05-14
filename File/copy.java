public class Demo {
    public static void main(String[] args) throws IOException {
        //打开文件aaa.txt
        File file = new File("aaa.txt");
        //输出文件bbbb.txt，
        File dest = new File("bbbb.txt");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(dest);
            byte [] buffer = new byte[1024];
            int lengh = 0;
            //复制到输出文件中
            while ((lengh = inputStream.read(buffer))!=-1){
                outputStream.write(buffer);
            }
            //捕获异常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            //输入，输出流关闭
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
