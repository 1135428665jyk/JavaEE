public class demo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("liming","数学","数学",10);
        teacher.showData();
    }

}
class Teacher{
    //私用属性
    private String name;
    private String direction;
    private String course;
    private int age_teach;
    //构造函数
    public Teacher(String name, String direction, String course, int age_teach) {
        this.name = name;
        this.direction = direction;
        this.course = course;
        this.age_teach = age_teach;
    }
    //成员方法
    public void showData()
    {
        System.out.println(name);
        System.out.println(direction);
        System.out.println(course);
        System.out.println(age_teach);
    }
}
