public class Demo {
    public static void main(String[] args) {
        ClassDemo classDemo = new ClassDemo();
        classDemo.show();
        System.out.println(classDemo.getName());


        ClassDemo.Demo demo = new ClassDemo().new Demo();
        demo.test();
    }


}
