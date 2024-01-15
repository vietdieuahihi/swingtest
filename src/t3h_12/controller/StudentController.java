package t3h_12.controller;

public class StudentController {
    
    private StudentController(){
        //throw new
    }
    private static StudentController instance;

    public static StudentController getInstance(){
        if(instance == null){
            System.out.println("instance is call new");
            instance = new StudentController();
        }
        return instance;
    }
}
