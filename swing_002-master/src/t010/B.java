package t010;

public class B extends A{

    public String mark() {
        super.mark();
        return "B";
    }

    public void handle() {
        int number = 5;

        // number = 4
        while (number >= 1) {
            if (number == 2 || number == 4) {
                number--;
                continue;
            }
            // in ra màn hình: 5-
            System.out.print(number + "-");
            number--;
        }
    }
}
