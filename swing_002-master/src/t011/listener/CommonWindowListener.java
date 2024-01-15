package t011.listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public abstract class CommonWindowListener implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("a");
        }

        @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

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
