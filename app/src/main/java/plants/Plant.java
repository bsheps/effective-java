package effectiveJava;

import java.util.Objects;

public class Plant {
    public enum Genus { IVY, JADE }
    private String name;

    public Plant(String name){
        this.name = name;
    }

    public static Plant of(Genus genus){
        Genus gen = Objects.requireNonNull(genus);
        if(gen == Genus.IVY){
            return new Ivy("green");
        }else if (gen == Genus.JADE){
            return new Jade("pot");
        }
        return new Plant(null);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}