package t008;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        while (true) {
            count ++;
            System.out.println("A");
            if (count > 100) break;
        }

        System.out.println("B");
    }
}
