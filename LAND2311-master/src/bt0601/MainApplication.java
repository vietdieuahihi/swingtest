package bt0601;

import bt0601.model.Student;
import bt0601.view.LoadDataScreen;
import bt0601.view.NewDataScreen;
import bt0601.view.SplashScreen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.initConfig();
        splashScreen.run();
    }
}
