package ss5_accessmodifier.bai_tap;

public class Students {
    private String name ;
    private String classes;
    public Students(){
        name = " john";
        classes = " C02";
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }
    public String getClasses(){
        return classes;
    }
}
