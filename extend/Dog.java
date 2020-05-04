public class Dog{
    private String name;
    private int health;
    private String love;
    private String kind;

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
        if (health<=100&&health>=0) {
            this.health = health;
        }
    }

    public String getDear() {
        return love;
    }

    public void setDear(String love) {
        this.love = love;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Heathy:"+health);
        System.out.println("Dear:"+love);
        System.out.println("Kind:"+kind);
    }
}
