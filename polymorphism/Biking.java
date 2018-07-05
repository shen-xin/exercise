package polymorphism;

class Cycle{
    private String name = "cycle";
    private int wheels = 0;
    public static void travel(Cycle c){
        System.out.println("Cycle.ride() " + c);
    }
    public int wheels(){
        return wheels;
    }
    public String toString(){
        return name;
    }
}

class Unicycle extends Cycle{
    private String name = "Unicycle";
    private int wheels = 1;
    public String toString(){
        return name;
    }

    @Override
    public int wheels() {
        return wheels;
    }
}

class Bicycle extends Cycle{
    private String name = "Bicycle";
    private int wheels = 2;
    public String toString(){
        return name;
    }

    @Override
    public int wheels() {
        return wheels;
    }
}

class Tricycle extends Cycle{
    private String name = "Tricycle";
    private int wheels = 3;
    public String toString(){
        return name;
    }

    @Override
    public int wheels() {
        return wheels;
    }
}

public class Biking {
    public static void ride(Cycle c){
        c.travel(c);
        System.out.println(c.wheels());
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
