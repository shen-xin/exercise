package reusing;
class temp{
    private int i;
    temp(int i){
        this.i = i;
    }
    @Override
    public String toString(){
        return ("temp " + i);
    }

}
public class BlankFinalQT {
    private final temp i;
    public BlankFinalQT(){
        i = new temp(1);
    }
    public BlankFinalQT(int i){
        this.i = new temp(i);
    }

    public static void main(String[] args) {
        BlankFinalQT f = new BlankFinalQT();
        BlankFinalQT s = new BlankFinalQT(47);
        System.out.println(f.i);
        System.out.println(s.i);
    }
}
