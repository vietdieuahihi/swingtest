package t011;

import t011.widget.Form;

import java.awt.event.WindowAdapter;

public class MainApplication {

    public static void main(String[] args) {
        Form form = new Form();
        form.initConfig();
        form.run();
    }
}
