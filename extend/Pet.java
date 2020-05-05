/*可以在子类中进行继承
*/
public class Pet {
    private String name;
    private int heathy;
    private String love;

    public Pet(String name, int heathy, String love) {
        this.name = name;
        this.heathy = heathy;
        this.love = love;
    }
    public  Pet(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeathy() {
        return heathy;
    }

    public void setHeathy(int heathy) {
        this.heathy = heathy;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }
    public  void showData(){
        System.out.println("Name:"+name);
        System.out.println("Love:"+love);
        System.out.println("Heathy:"+heathy);
    }
}


