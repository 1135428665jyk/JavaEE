public class Demo {
    public static void main(String[] args) {
        System.out.println("please Input ");
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            ){
            String str = "";
            while (!str.equals("exit")){
                str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
