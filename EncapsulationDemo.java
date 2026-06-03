class Student {
    private int age = 20;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(25);

        System.out.println("Age: " + s.getAge());
    }
}