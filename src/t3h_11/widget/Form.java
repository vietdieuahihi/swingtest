package t3h_11.widget;

import javax.swing.*;
import java.awt.*;

public class Form {

    private JFrame j1;

    public Form(){
        j1 = new JFrame();
    }

    public Form(JFrame j1){
        this.j1 = j1;
    }

    public void initConfig(){
        j1.setLayout(null);
        j1.setSize(400,400);
        j1.setTitle("Màn hình");
        j1.setLocation(200,200);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn1 = new JButton();
        btn1.setText("Cộng");
        //btn1.setSize(100,50);
        btn1.setBounds(0,0,100,50);

        JButton btn2 = new JButton();;
        btn2.setText("Trừ");
        btn2.setBounds(300,0,100,50);

        JLabel lab1 = new JLabel();
        lab1.setText("Kết quả: ");
        lab1.setBounds(150,60,100,50);
        //lab1.setBackground(Color.blue);

        JTextField tf1 = new JTextField();
        tf1.setBounds(90,120,100,50);

        j1.add(btn1);
        j1.add(btn2);
        j1.add(lab1);
        j1.add(tf1);
    }

    public void run(){
        j1.setVisible(true);
    }
}
