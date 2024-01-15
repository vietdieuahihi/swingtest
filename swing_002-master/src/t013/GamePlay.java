package t013;

import t013.controller.ReadMap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.List;
import java.util.function.Consumer;

public class GamePlay extends JFrame {

    private static int SIZE_ITEM_MAP = 16;
    private static int SIZE_ITEM_TANK = 32;

    private JLabel myTank;

    public GamePlay() {
        setTitle("Game Tank 1990");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        // Yêu cầu 1: DONE
        List<String> result = ReadMap.getMap(1);

        // Yêu cầu 2: DONE
        // Theo như đề bài yêu cầu: Mỗi một ký tự trong map sẽ có kích thước là
        // 20x20 pixel
        // => Sét lại giá trị width , height của frame sao cho nó trùng khớp với
        // dữ        liệu file map

        // Yêu cầu 3: Đọc vị bản đồ map, hiển thị các ký tự thành các item tương ứng
        for (int i = 0; i < result.size(); i++) {
            String s = result.get(i);
            for (int j = 0; j < s.length(); j++) {
                panel.add(createItemMap(String.valueOf(s.charAt(j)), j, i));
            }
        }

        // Issue 1: bị thiếu mất 1 cột + 2 hàng? Nguyên nhân, và hướng xử lý

        setBounds(0, 0, result.get(0).length() * SIZE_ITEM_MAP, result.size() * SIZE_ITEM_MAP);

        // yêu cầu 4:
        // 4.1: Add 1 icon là biểu tượng myTank vào vị trí trống ( tức là vị trí . trên map )

        // col = 8 row = 23
        panel.add(createItemMap("tank", 8, 21));
        // 4.2: Khi nhận được các phím di chuyển mũi tên trên bàn phím
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // TODO
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 38) {
                    // TODO: TOP
                    if (myTank != null) {
                        myTank.setIcon(new ImageIcon(GamePlay.class.getResource("assets/bg/my_tank_top.png")));
                    }
                } else if (e.getKeyCode() == 37) {
                    // TODO: Left
                    if (myTank != null) {
                        myTank.setIcon(new ImageIcon(GamePlay.class.getResource("assets/bg/my_tank_left.png")));
                    }
                } else if (e.getKeyCode() == 39) {
                    // TODO: Right
                    if (myTank != null) {
                        myTank.setIcon(new ImageIcon(GamePlay.class.getResource("assets/bg/my_tank_right.png")));
                    }
                } else if (e.getKeyCode() == 40) {
                    // TODO: Bottom
                    if (myTank != null) {
                        myTank.setIcon(new ImageIcon(GamePlay.class.getResource("assets/bg/my_tank_bottom.png")));
                    }
                }
            }
        });

        // 4.2.1: Xoay myTank theo hướng chỉ định
        // 4.2.2: Di chuyển 1 đơn vị
        // 4.2.3: Nếu gặp trở ngại ko cho phép di chuyển nữa ( đứng im )

        add(panel);
        setResizable(false);
    }

    private JLabel createItemMap(String position, int col, int row) {
        JLabel jLabel = new JLabel();
        ImageIcon icon;
        int width = SIZE_ITEM_MAP;
        int height = SIZE_ITEM_MAP;
        switch (position) {
            case "#":
                icon = new ImageIcon(GamePlay.class.getResource("assets/bg/brick.png"));
                break;
            case "@":
                icon = new ImageIcon(GamePlay.class.getResource("assets/bg/stone.png"));
                break;
            case "tank":
                width = SIZE_ITEM_TANK;
                height = SIZE_ITEM_TANK;
                icon = new ImageIcon(GamePlay.class.getResource("assets/bg/my_tank_top.png"));
                break;
            default:
                icon = new ImageIcon();
                break;
        }
        if (position.equals("tank")) {
            myTank = new JLabel();
            myTank.setIcon(icon);
            myTank.setBounds(col * SIZE_ITEM_MAP, row * SIZE_ITEM_MAP, width, height);
            return myTank;
        } else {
            jLabel.setIcon(icon);
            jLabel.setBounds(col * SIZE_ITEM_MAP, row * SIZE_ITEM_MAP, width, height);
            return jLabel;
        }
    }

    public void run() {
        setVisible(true);
    }

    public static void main(String[] args) {
        new GamePlay().run();
    }
}
