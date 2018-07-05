package polymorphism;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        s.erase();
    }
}
