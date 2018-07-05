package reusing;

import static Succinct.Print.*;
class Component1 {
    Component1(byte b) { println("Component1(byte): "+ b); }
}

class Component2 {
    Component2(short s) { println("Component2(short): "+ s); }
}

class Component3 {
    Component3(int i) { println("Component3(int): " +i); }
}

class Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Root(float f) {
        c1root = new Component1((byte)0);
        c2root = new Component2((short)0);
        c3root = new Component3(0);
        println("Root(float): " +f);
    }
}

class Stem10 extends Root {
    Component1 c1stem10;
    Component2 c2stem10;
    Component3 c3stem10;
    Stem10(double d) {
        super(2.78f);
        c1stem10 = new Component1((byte)1);
        c2stem10 = new Component2((short)1);
        c3stem10 = new Component3(1);
        println("Stem10(double): " + d);
    }
    public static void main(String[] args) {
        Stem10 x = new Stem10(2.14);
    }
}