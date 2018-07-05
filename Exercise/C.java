package Exercise;

class A2 { A2(){ System.out.println("A()");} }

class B2 extends A2 { B2(){ System.out.println("B()");} }

class C2 extends A2 {
    B2 b = new B2(); // will then construct another A and then a B

    public static void main(String[] args) {
        C2 c = new C2(); // will construct an A first
    }
}
