package bt0601.view;

import bt0601.listener.CustomMouseListener;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class SplashScreen {
    private JFrame frame1;

    public SplashScreen() {
        frame1 = new JFrame("Student Manager");
    }

    public void initConfig() {
        frame1.setLayout(null);
        frame1.setSize(600, 400);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton();
        button1.setText("Load Data");
        button1.setBounds(100, 185, 150, 30);
        frame1.add(button1);
        button1.addMouseListener(new CustomMouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                LoadDataScreen loadDataScreen = new LoadDataScreen();
                loadDataScreen.initConfig();
                loadDataScreen.run();
                frame1.setVisible(false);

            }
        });

        JButton button2 = new JButton();
        button2.setText("New Data");
        button2.setBounds(350, 185, 150, 30);
        frame1.add(button2);

        button2.addMouseListener(new CustomMouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                NewDataScreen newDataScreen = new NewDataScreen();
                newDataScreen.initConfig();
                newDataScreen.run();
                frame1.setVisible(false);
            }
        });
    }

    public void run() {
        frame1.setVisible(true);
    }
}
