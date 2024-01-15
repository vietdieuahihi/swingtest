package T007;

public class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.age = age;
    }

    public void setAge(int year) {
        year += 1;
    }

    public void setAge() {
        age += 1;
    }

    public void updateAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age: " + age;
    }
}
