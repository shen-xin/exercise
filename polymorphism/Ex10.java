package polymorphism;

class a {
    protected void f(){
        System.out.println("a.f()");
        this.g();
    }
    protected void g(){
        System.out.println("a.g()");
    }
}

class b extends a{
    @Override
    protected void g(){
        System.out.println("b.g()");
    }
}
public class Ex10 {
    public static void main(String[] args) {
        a b = new b();
        b.f();
    }
}
