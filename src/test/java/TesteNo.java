import org.example.No;

public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);

        System.out.println("No 1: " + no1);
        System.out.println("No 2: " + no2);

        no1.setProximo(no2);
        no1.getProximo().setInfo(25);

        System.out.println("No2 2: " + no2);
    }
}
