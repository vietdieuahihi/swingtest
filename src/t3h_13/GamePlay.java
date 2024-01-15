package t3h_13;

import javax.swing.*;
import java.awt.*;

public class GamePlay extends JFrame {
    public GamePlay(){
        setTitle("Tank 1990");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        add(panel);
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
    }

    public void run(){
        setVisible(true);
    }

    public static void main(String[] args) {
        new GamePlay().run();
    }
}
