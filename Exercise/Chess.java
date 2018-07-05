package Exercise;

class Game {
    Game(int i) {
        System.out.print("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        // System.out.print("BoardGame constructor"); // call to super must be first
        // statement in constructor 
        super(i); // else: "cannot find symbol: constructor Game()
        System.out.print("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.print("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}