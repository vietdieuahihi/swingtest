package bt0601.view;

import bt0601.controller.StudentController;
import bt0601.listener.CustomMouseListener;
import bt0601.model.Student;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class NewDataScreen {
    private JFrame frame1;

    public NewDataScreen() {
        frame1 = new JFrame("Add Student");
    }

    public void initConfig() {
        frame1.setLayout(null);
        frame1.setSize(600, 400);
        frame1.setLocation(0, 410);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel jLabel1 = new JLabel("Fill new student info:");
        jLabel1.setBounds(10, 10, 600, 30);
        frame1.add(jLabel1);

        JLabel jLabel2 = new JLabel("Student ID:");
        jLabel2.setBounds(10, 40, 100, 30);
        frame1.add(jLabel2);

        JLabel jLabel3 = new JLabel("Student Name:");
        jLabel3.setBounds(10, 75, 100, 30);
        frame1.add(jLabel3);

        JLabel jLabel4 = new JLabel("Student BDay:");
        jLabel4.setBounds(10, 110, 100, 30);
        frame1.add(jLabel4);

        JLabel jLabel5 = new JLabel("Class ID:");
        jLabel5.setBounds(10, 145, 100, 30);
        frame1.add(jLabel5);

        JLabel jLabel6 = new JLabel("Class Time:");
        jLabel6.setBounds(10, 180, 100, 30);
        frame1.add(jLabel6);

        JLabel jLabel7 = new JLabel("Teacher ID:");
        jLabel7.setBounds(10, 215, 100, 30);
        frame1.add(jLabel7);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(110, 40, 200, 30);
        frame1.add(jTextField1);

        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(110, 75, 200, 30);
        frame1.add(jTextField2);

        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(110, 110, 200, 30);
        frame1.add(jTextField3);

        JTextField jTextField4 = new JTextField();
        jTextField4.setBounds(110, 145, 200, 30);
        frame1.add(jTextField4);

        JTextField jTextField5 = new JTextField();
        jTextField5.setBounds(110, 180, 200, 30);
        frame1.add(jTextField5);

        JTextField jTextField6 = new JTextField();
        jTextField6.setBounds(110, 215, 200, 30);
        frame1.add(jTextField6);

        JButton button = new JButton("Save");
        button.setBounds(10, 260, 100, 30);
        frame1.add(button);

        JLabel jLabel8 = new JLabel("");
        jLabel8.setBounds(10, 300, 600, 30);
        frame1.add(jLabel8);

        button.addMouseListener(new CustomMouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    String id = jTextField1.getText();
                    String name = jTextField2.getText();
                    String bDay = jTextField3.getText();
                    String classID = jTextField4.getText();
                    String classTime = jTextField5.getText();
                    String teacherID = jTextField6.getText();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                    Student a = new Student(Integer.parseInt(id), name, bDay, classID, classTime, teacherID);
                    StudentController studentController = StudentController.getInstance();
                    studentController.loadData();
                    studentController.addData(a);
                    studentController.saveData();
                    jLabel8.setText("Success!");
                } catch (NumberFormatException nfe) {
                    jLabel8.setText("Student ID must be number!");
                }
            }
        });

    }

    public void run() {
        frame1.setVisible(true);
    }
}
