package t010;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Consumer;

public class BT {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] argr) {
        students.add(new Student(1, "T3H"));
        students.add(new Student(2, "Hello"));
        saveStudents(students);
    }

    public static void saveStudents(ArrayList<Student> students) {
        String pathName = null;
        File file = new File("E:\\LAND2311\\src\\t010\\students.txt");
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Tao file thanh cong");
                } else {
                    System.out.println("Tao file that bai");
                    return;
                }
            }
            FileOutputStream fos = new FileOutputStream(file);

            int count = 0;
            students.forEach(student -> {
                byte[] array = String.valueOf(count).concat("\n").getBytes();
                try {
                    fos.write(array);
                    array = student.toString().getBytes();
                    fos.write(array);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
