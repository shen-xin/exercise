package polymorphism;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
        t.erase();
    }
}
