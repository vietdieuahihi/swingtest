package t012.controller;

import t012.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private StudentController() {
        // throw new IllegalArgumentException("StudentController is not call constructor default");
    }

    private int a = 10;

    private static StudentController instance;

    public static StudentController getInstance() {
        if (instance == null) {
            instance = new StudentController();
        }
        return instance;
    }

    public void setA() {
        a += 10;
    }

    public void getA() {
        System.out.println("a = " + a);
    }

    public List<Student> getStudents() {
        ArrayList<Student> results = new ArrayList<>();

        File file = new File("src//t012//assets//data.txt");
        if (!file.exists()) {
            return results;
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buf = new BufferedReader(fileReader);

            String line;

            while ((line = buf.readLine()) != null) {
                String[] split = line.split(",");
                if (split.length <= 0) continue;
                try {
                    Student student = new Student();
                    student.setMssv(Integer.parseInt(split[0]));
                    student.setHoTen(split[1]);
                    student.setNgaySinh(split[2]);
                    student.setMaLop(split[3]);
                    student.setGioHoc(split[4]);
                    student.setMSGV(split[5]);

                    results.add(student);
                } catch (Exception ex) {
                    System.out.println("Ep kieu khong thanh cong");
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return results;
    }
}
