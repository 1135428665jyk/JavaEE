public class Demo {
    public static void main(String[] args) throws IOException {
    
        File file = new File("aaa.txt");
        File dest = new File("bbbb.txt");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(dest);
            byte [] buffer = new byte[1024];
            int lengh = 0;
            while ((lengh = inputStream.read(buffer))!=-1){
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
