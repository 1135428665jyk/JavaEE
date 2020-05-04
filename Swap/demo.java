public class packageTest {
    static void swapData(Swap a,Swap b){
        int x = a.getX();
        int y = b.getX();
        int temp = x;
        x = y;
        y = temp;
        a.setX(x);
        b.setX(y);
    }
    public static void main(String[] args) {
        Swap a = new Swap(10);
        Swap b = new Swap(20);
        swapData(a,b);
        System.out.println(a.getX());
        System.out.println(b.getX());

    }
}

class Swap{
    private int x;

    public Swap(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
