package reusing;

public class BasicDevice {
    private String s;
    public BasicDevice(){
        s = "Original";
    }
    protected void changeS(String s){
        this.s = s;
    }
    public void showS(){
        System.out.println(s);
    }
}
