/*
接口类似于C++的多继承，可以由多个实现
接口中的方法，在实现中必须补全方法


*/


public class TestDemo implements Door,Lock {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }


    @Override
    public void open() {
        System.out.println("开锁");
    }

    @Override
    public void close() {
        System.out.println("关锁");
        System.out.println(Door.a);
    }


}
