package polymorphism;

import static Succinct.Print.*;


class Keyboard extends Instrument {
    void play(Note n) { print("Keyboard.play() " + n); }
    public String toString() { return "Keyboard"; }
    void adjust() { print("Adjusting Keyboard"); }
}

class Piano extends Keyboard {
    void play(Note n) { print("Piano.play() " + n); }
    public String toString() { return "Piano"; }
}

public class Music7 {
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
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };
        tuneAll(orchestra);
        for(Instrument i : orchestra)
            System.out.println(i);
    }
}