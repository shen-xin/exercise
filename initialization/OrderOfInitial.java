package initialization;

    class House{
        Window w2 = new Window(2);
        void f(){
            System.out.println("f()");
        }
        Window w3 = new Window(3);
        House(){
            System.out.println("House()");
        }
        Door d1 = new Door();
        Window w1 = new Window(1);
    }

    class Window{
        Window(int marker){
            System.out.println("Window(" + marker + ")");
        }
    }

    class Door{
    Door(){
        System.out.println("Door()");
        Window w4 = new Window(4);
    }
    void f2(){
        System.out.println("f2()");
        Window w5 = new Window(5);
    }
    }
public class OrderOfInitial {
    public static void main(String[] args) {
        House h = new House();
        h.f();
        Door d = new Door();
        d.f2();
    }
}
