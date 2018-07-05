package polymorphism;

public class Shapes {
    private static RandShapeGenerator gen =
            new RandShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp:
             s) {
            shp.draw();
            shp.amend();
        }
    }
}
