package initialization;

class Book{
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkOut(){
        checkedOut = false;
    }
    void checkLn(){
        checkedOut = true;
    }
    protected void finalize(){
        if (checkedOut)
            System.out.println("Error: checked out");
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        Book science = new Book(true);
        novel.checkOut();
        novel.checkLn();
        new Book(true);
        System.gc();
    }
}
