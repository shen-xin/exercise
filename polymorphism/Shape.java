package polymorphism;

public class Shape {
    public void draw(){
        System.out.println("Shape.draw()");
    }
    public void erase(){
        System.out.println("Shape.erase()");
    }

    public void amend(){
        System.out.println("amend()");
    }
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.erase();
        s.amend();
    }
}
