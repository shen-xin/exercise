package reusing;

class Water{
    private String s;
    Water(){
        System.out.println("Water");
        s = "constructor";
    }

    public String toString(){
        return s;
    }
}
class WaterSource extends Water{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s =  super.toString();
    }
    public String toString(){
        return s +"()";
    }
}
public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return
                "valve1 = " + valve1 +" "
                +"valve2 = " + valve2 +" "
                +"valve3 = " + valve3 +" "
                +"valve4 = " + valve4 +"\n"
                +"i = " + i + " " + "f = " +f
                +" source = " +source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}


