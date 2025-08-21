public class Main {
    static int val = 100;
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(val);
        add();
        System.out.print(val);
        System.out.print("Bye");
        System.out.print(adde(9,10));
    }
    public static void add() {
        int a = 10;
        int b = 9;
        val=val-10;
        int c = a+b;
        sub();
        System.out.print(c);
    }
    public static void sub() {
        int a = 10;
        int b = 9;
        int c = a - b;
        System.out.print(c);
    }
    public static int adde(int a, int b) {
        int c = a+b;
        return c;
    }
}