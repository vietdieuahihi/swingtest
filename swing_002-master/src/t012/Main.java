package t012;

import t012.controller.StudentController;
import t012.model.Student;
import t012.view.NewDataScreen;
import t012.view.SplashScreen;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
//        SplashScreen splashScreen  = new SplashScreen();
//        splashScreen.a();
//
//        NewDataScreen newDataScreen = new NewDataScreen();
//        newDataScreen.a();

        StudentController.getInstance().getStudents().forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println("SV = " +student);
            }
        });
    }
}
