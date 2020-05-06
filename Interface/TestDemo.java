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
