public class DogExtend extends Pet{
    private String kind;


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DogExtend(String name, int heathy, String love, String kind) {
        super(name, heathy, love);
        this.kind = kind;
    }

    public void show(){
        super.showData();
        System.out.println("Kind:"+kind);
    }
}
