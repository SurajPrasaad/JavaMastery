public class classExample {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Suraj Kumar";
        s1.collegeName = "VNSGU";
        s1.age = 21;

        s1.markAttendance();
        s1.printStudentDetails();
    }
}

class Student {
    int rollNo;
    String name;
    String collegeName;
    int age;

    void markAttendance() {
        System.out.println("Attendance Mark Successfully...");
    }

    void printStudentDetails() {
        System.out.println("RollNo : "+rollNo + "\nName : " + name + "\nCollegeName : " + collegeName + "\nAge : " + age);
    }
}