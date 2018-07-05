package Exercise;

class Doc {
    Doc(int i) {
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with " + i + " years of training");
    }
    Doc(String s) {
        String degree = s;
        System.out.println("New doc with " + s + " degree");
    }
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

public class OverloadedConstructors {
    public static void main(String[] args) {
        new Doc(8).intubate();
    }
}
