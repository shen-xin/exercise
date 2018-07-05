package Mini;

import java.util.Random;

public class ForName {
    public static void main(String[] args) {
        Random random = new Random();
        Class cl = random.getClass();
        String s = cl.getName();
        System.out.println(s);
        Class c2 = Random.class;
        System.out.println(c2);
        Class c3 = int.class;
        System.out.println(c3);
        Class c4 = Double[].class;
        System.out.println(c4);
        String s2 = int[].class.getName();
        System.out.println(s2);
    }
}
