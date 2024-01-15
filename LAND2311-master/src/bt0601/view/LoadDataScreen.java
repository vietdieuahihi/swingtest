package bt0601.view;

import bt0601.controller.StudentController;
import bt0601.listener.CustomMouseListener;
import bt0601.model.Student;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class LoadDataScreen {
    private JFrame frame1;

    public LoadDataScreen() {
        frame1 = new JFrame("Student List");
    }

    public void initConfig() {
        frame1.setLayout(null);
        frame1.setSize(600, 900);
        frame1.setLocation(600, 0);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JLabel jLabel1 = new JLabel("Student List");
        jLabel1.setBounds(10, 10, 100, 30);
        frame1.add(jLabel1);

        JLabel jLabel2 = new JLabel("");
        jLabel2.setBounds(150, 10, 200, 30);
        frame1.add(jLabel2);

        StudentController a = StudentController.getInstance();
        a.loadData();
        JList<Student> jList = new JList<>();
        jList.setBounds(10, 50, 580, 1000);
        DefaultListModel<Student> listModel = new DefaultListModel<>();
        for (Student i : a.studentList) {
            listModel.addElement(i);
        }
        jList.setModel(listModel);
        jList.addMouseListener(new CustomMouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jLabel2.setText("Hello " + jList.getSelectedValue().getName() + "!");
            }
        });
        frame1.add(jList);
    }

    public void run() {
        frame1.setVisible(true);
    }
}
