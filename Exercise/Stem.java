package Exercise;

import static  Succinct.Print.*;
class Component1 {
    Component1() { println("Component1()"); }
}

class Component2 {
    Component2() { println("Component2()"); }
}

class Component3 {
    Component3() { println("Component3()"); }
}

class Root {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Root() {
        println("Root()");
        c1root = new Component1();
        c2root = new Component2();
        c3root = new Component3();
    }
}

class Stem extends Root {
    Component1 c1stem;
    Component2 c2stem;
    Component3 c3stem;
    Stem() { println("Stem()"); }
    public static void main(String[] args) {
        Stem s = new Stem();
    }
}
