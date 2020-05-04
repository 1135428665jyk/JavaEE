public class packageTest{
    public static void main(String[]args){

        Dog dog = new Dog();
        dog.setName("小白");
        dog.setKind("hei");
        dog.setHealth(20);
        dog.setDear("可爱");
        dog.show();
        Penguin penguin = new Penguin();
        penguin.setName("企鹅");
        penguin.setHealth(90);
        penguin.setLove("可爱");
        penguin.setSex("male");
        penguin.show();
        }
}
