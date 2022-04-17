package effectiveJava;

public class Ivy extends Plant{
    // public enum VineColor {GREEN, BROWN, YELLOW}
    private final String vineColor;

    public Ivy (String vineColor){
        super("Poison ivy");
        this.vineColor = vineColor;
    }

    public String getVineColor(){
        return vineColor;
    }
}