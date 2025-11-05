public class Main {
    public static void main(String[] args) {
        long start= System.currentTimeMillis();
        for(int i=0;i<10000_00;i++) {

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}