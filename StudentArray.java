class StudentArray {

    int id;
    String name;

    StudentArray(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        StudentArray[] students = new StudentArray[3];

        students[0] = new StudentArray(101, "Ravi");
        students[1] = new StudentArray(102, "Anu");
        students[2] = new StudentArray(103, "Kiran");

        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println("-----");
        }
    }
}