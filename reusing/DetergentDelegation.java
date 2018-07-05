package reusing;

import static Succinct.Print.*;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        print(x);
    }
}

public class DetergentDelegation {
    private String s = "DetergentDelegation";
    Cleanser c = new Cleanser();
    public void append(String a) { s += a; }
    // two methods delegated entirely to Cleanser c:
    public void dilute() {
        c.dilute();
    }
    public void apply() {
        c.apply();
    }
    // method delegated in part to Cleanser c:
    public void scrub() {
        append(" DetergentDelegation.scrub()");
        c.scrub();
    }
    public void foam() { append(" foam()"); }
    public String toString() { return s + " " + c; }
    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}