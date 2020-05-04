/**
 * @Classname demo
 * @Description TODO
 * @Date 2020/5/2 11:24
 * @Created by JYK
 */
/*
*this表示当前对象的引用
* 用处：
*   1、构造方法，当局部变量和成员变量相同时，使用this引用
*       注意有了this之后可以将构造参数跟成员变量保持一致
*   2、当多个普通方法之间调用时，可以采用this进行调用
*   3、
*
* */

public class demo {
    public static void main(String[] args) {
        Point point = new Point(10,20);
        Point point1 = new Point(30,40);
        double res = point.calculation(point1);
        System.out.println("两点之间的距离为：");
        System.out.println(res);
    }

}
class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public double calculation(Point oth){
        double result;
        result = Math.sqrt(Math.pow((x-oth.x),2)+Math.pow((y-oth.y),2));
        return result;
    }
}
