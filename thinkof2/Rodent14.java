package thinkof2;

import static Succinct.Print.*;
import java.util.*;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() { println("Creating " + this); }
	public void addRef() { refcount++; }
	public String toString() { return "Shared " + id; }
	public void showRefcount() { println("refcount = " + refcount); }
}

class RandomRodentGenerator {
	// same shared object to be passed to every Rodent:
    protected Shared shared = new Shared();
	private Random rand = new Random();
	public Rodent next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse(shared);
			case 1: return new Rat(shared);
			case 2: return new Squirrel(shared);
		}
	}
 }
class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        println("Creating Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        println("Creating Description " + s);
    }
}

class Rodent {
    private String name = "Rodent";
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");
    Rodent(Shared shared) {
        println("Rodent() " + id);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void eat() { println("Rodent.eat()"); }
    protected void run() { println("Rodent.run()"); }
    protected void sleep() { println("Rodent.sleep()"); }
    public String toString() { return name + " " + id; }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    private Characteristic c = new Characteristic("likes cheese");
    private Description d = new Description("nocturnal");
    Mouse(Shared shared) {
        super(shared);
        println("Mouse()");
    }
    protected void eat() { println("Mouse.eat()"); }
    protected void run() { println("Mouse.run()"); }
    protected void sleep() { println("Mouse.sleep()"); }
    public String toString() { return name + ", " + super.toString(); }
}

class Rat extends Rodent {
    private String name = "Rat";
    private Characteristic c = new Characteristic("larger");
    private Description d = new Description("black");
    Rat(Shared shared) {
        super(shared);
        println("Rat()");
    }
    protected void eat() { println("Rat.eat()"); }
    protected void run() { println("Rat.run()"); }
    protected void sleep() { println("Rat.sleep()"); }
    public String toString() { return name + ", " + super.toString(); }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    private Characteristic c = new Characteristic("climbs trees");
    private Description d = new Description("likes nuts");
    Squirrel(Shared shared) {
        super(shared);
        println("Squirrel()");
    }
    protected void eat() { println("Squirrel.eat()"); }
    protected void run() { println("Squirrel.run()"); }
    protected void sleep() { println("Squirrel.sleep()"); }
    public String toString() { return name + ", " + super.toString(); }
}

public class Rodent14 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        for(Rodent r : rodents) {
            r = gen.next();
            println(r);
        }
        gen.shared.showRefcount();
    }
}