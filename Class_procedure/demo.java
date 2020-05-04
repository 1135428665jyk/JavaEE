public class demo {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.num);
        System.out.println(student.name);
        System.out.println(student.age);
        student.num = 2323;
        student.name = "liming";
        student.age = 30;
        System.out.println(student.num);
        System.out.println(student.name);
        System.out.println(student.age);

    }

}
class Student{
    int num;
    String name;
    int age = 20;

    void study(){
        System.out.println("I am studying");
    }
    void eat(String food){
        System.out.println("I am eating "+food);
    }
}
