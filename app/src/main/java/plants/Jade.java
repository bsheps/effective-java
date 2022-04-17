package effectiveJava;

public class Jade extends Plant{
    private String container;

    public Jade(String container){
        super("Shrek ear jade");
        this.container = "Bucket";
    }
    public String getContainer(){
        return container;
    }
}