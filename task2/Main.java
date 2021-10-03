package task2;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String bins1 = bins.sum("10001", "11100");
        String bins2 = bins.mult("10001", "11100");
        System.out.println(bins1);
        System.out.println(bins2);
    }
}
