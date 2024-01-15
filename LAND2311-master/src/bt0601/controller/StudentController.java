package bt0601.controller;

import bt0601.model.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class StudentController {
    public ArrayList<Student> studentList = new ArrayList<>();

    private StudentController() {
    }

    private static StudentController instance;

    public static StudentController getInstance() {
        if (instance == null) {
            System.out.println("Instance is call new");
            instance = new StudentController();
        }
        System.out.println("Instance is call return");
        return instance;
    }

    public void loadData() {
        try {
            this.studentList.clear();
            File file = new File("src\\bt0601\\data.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            ArrayList<String> readLine = new ArrayList<>();
            int count = fileInputStream.available();
            String chuoi = "";
            for (int i = 0; i < count; i++) {
                char temp = (char) fileInputStream.read();
                if (temp == ' ') continue;
                if (temp == '\n') {
                    readLine.add(chuoi);
                    chuoi = "";
                    continue;
                }
                chuoi += String.valueOf(temp);
                if (i == (count-1)) {
                    readLine.add(chuoi);
                }
            }
            chuoi = "";
            ArrayList<String> readData = new ArrayList<>();
            for (int j = 1; j < readLine.size(); j++) {
                String s = readLine.get(j);
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ',') {
                        readData.add(chuoi);
                        chuoi = "";
                        continue;
                    }
                    chuoi += String.valueOf(s.charAt(i));
                    if (i == s.length() - 1) {
                        readData.add(chuoi);
                        chuoi = "";
                    }
                }
                Student student = new Student(Integer.parseInt(readData.get(0)), readData.get(1), readData.get(2), readData.get(3), readData.get(4), readData.get(5));
                this.studentList.add(student);
                readData.clear();
            }
//            System.out.println(studentList.get(studentList.size()-1));
//            System.out.println(studentList.get(studentList.size()-2));
//            System.out.println(studentList.get(studentList.size()-3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveData() {
        try {
            File file = new File("src\\bt0601\\data.txt");
            FileOutputStream fos = new FileOutputStream(file, true);
            String a = "\n" + this.studentList.get(studentList.size() - 1).toString();
            fos.write(a.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addData(Student student) {
        this.studentList.add(student);
    }
}
