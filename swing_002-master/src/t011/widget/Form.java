package t011.widget;

import t011.listener.CommonWindowListener;
import t011.listener.CustomMouseListener;
import t011.listener.CustomWindowListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class Form {

    private JFrame frame1;
    private int count;

    public Form() {
        frame1 = new JFrame("Hello");
    }

    public Form(JFrame frame1) {
        this.frame1 = frame1;
    }

    public void initConfig() {
        // frame1.setLayout(null); // Không sử dụng trình quản lý layout
        frame1.setLocation(100, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.addWindowListener(new CommonWindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                System.out.println("b");
            }
        });

        // menu
        JMenuItem item1 = new JMenuItem("Open file");
        JMenuItem item2 = new JMenuItem(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save file");
            }
        });
        item2.setText("Save file");

        JMenu menu = new JMenu("File");

        menu.add(item1);
        menu.add(item2);

        JMenuBar jMenuBar = new JMenuBar();

        jMenuBar.add(menu);

        frame1.setJMenuBar(jMenuBar);

        // list
        JList<String> jList = new JList<>();
        jList.setBounds(50, 50, 220, 200);

//        jList.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
//                // System.out.println("jList.addMouseListener");
//            }
//        });

        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    System.out.println(
                            "Item click: " + jList.getSelectedValue()
                                    + " e.getValueIsAdjusting() = "
                                    + e.getValueIsAdjusting());
                }
            }
        });

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("World");
        listModel.add(0, "T3H");

        jList.setModel(listModel);

        frame1.add(jList);
        frame1.setSize(420, 500);
        frame1.setLayout(null);
    }

    public void run() {
        frame1.setVisible(true);
    }
}
