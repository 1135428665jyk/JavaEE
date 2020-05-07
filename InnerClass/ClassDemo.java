public class ClassDemo {
    private int ID;
    private String name;

    public ClassDemo(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public ClassDemo() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show");
    }
    class Demo{
        private int score;
        public void test(){
            System.out.println("test");
        }
    }
}
