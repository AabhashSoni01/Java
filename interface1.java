interface client1 {
    void print();
}

interface client2 {
    void print();

    void show();
}

class hello implements client1, client2 {
    public void print() {
        System.out.println("for both client1, client2");
    }

    public void show() {
        System.out.println("for client2");
    }
}

public class interface1 {

    public static void main(String[] args) {
        hello obj = new hello();
        obj.print();
        obj.show();
    }
}
