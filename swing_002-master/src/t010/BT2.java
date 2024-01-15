package t010;

import java.util.InputMismatchException;

public class BT2 {
    public static void main(String[] argr) {
        try {
            validate(12);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void validate(int age) throws CustomException {
        if (age < 18)
            throw new CustomException(1001, "Chưa đủ 18 tuổi");
        else
            System.out.println("Chào mừng bạn đến với khóa học Java");
    }


}
