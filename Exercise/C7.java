package Exercise;

class A3 {
    A3(char c, int i) { System.out.println("A(char, int)");}
}

class B3 extends A3 {
    B3(String s, float f){
        super(' ', 0);
        System.out.println("B(String, float)");
    }
}

class C7 extends A3 {
    private char c;
    private int i;
    C7(char a, int j) {
        super(a, j);
        c = a;
        i = j;
    }
    B3 b = new B3("hi", 1f); // will then construct another A and then a B
    public static void main(String[] args) {
        C7 c = new C7('b', 2); // will construct an A first
    }
}