public class Example {
    static int a = 100;   // static variable
    int b = 200;          // instance variable

    void display() {
        int c = 300;      // local variable

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String args[]) {
        Example obj = new Example();
        obj.display();
    }
}
