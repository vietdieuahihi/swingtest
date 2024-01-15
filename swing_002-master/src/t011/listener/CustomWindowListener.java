package t011.listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CustomWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
         System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
