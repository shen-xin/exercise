package initialization;

class InitTest {
    InitTest(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

 class InitTest17 {
    public static void main(String[] args) {
        InitTest[] it = new InitTest[5];
        for (int i = 0; i <it.length; i++) {
            it[i] = new InitTest(Integer.toString(i));
        }
    }
}

