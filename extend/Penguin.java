public class Penguin {
    private String name;
    private int health;
    private String love;
    private String sex;
    public Penguin(){

    }

    public Penguin(String name, int health, String love, String sex) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Heathy:"+health);
        System.out.println("Love:"+love);
        System.out.println("Sex:"+sex);
    }
}
