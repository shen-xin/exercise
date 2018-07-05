package polymorphism;

import java.util.Random;

class  RandomInstrumentGenerator{
    private Random rand = new Random();
    public Instrument next(){
        switch (rand.nextInt(7)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Keyboard();
            case 4:
                return new Brass();
            case 5:
                return new Woodwind();
            case 6:
                return new Piano();
        }
    }
}
public class Music8 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[20];
        // fill up orchestra array wth instruments:
        for(int i = 0; i < orchestra.length; i++)
            orchestra[i] = gen.next();
        tuneAll(orchestra);
        for(Instrument i : orchestra)
            System.out.println(i);
    }
}