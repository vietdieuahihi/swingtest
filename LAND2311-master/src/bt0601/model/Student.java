package bt0601.model;

public class Student {
    private int studentId;
    private String name;
    private String date;
    private String classID;
    private String classTime;
    private String teacherId;

    public Student() {
    }

    public Student(int studentId, String name, String date, String classID, String classTime, String teacherId) {
        this.studentId = studentId;
        this.name = name;
        this.date = date;
        this.classID = classID;
        this.classTime = classTime;
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return  studentId +
                "," + name +
                "," + date +
                "," + classID +
                "," + classTime +
                "," + teacherId;
    }
}
