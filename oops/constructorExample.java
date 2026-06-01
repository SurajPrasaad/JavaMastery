public class constructorExample {
    public static void main(String[] args) {
        //Default Constructor
        Student s1 = new Student();
        System.out.println("Name : " + s1.name);
        System.out.println("Roll No : " + s1.rollNo);
        System.out.println("College Name : " + s1.collegeName);
        System.out.println("Age : " + s1.age);

        //Parameterized Constructor
        Student s2 = new Student(102, "Krishna", 25, "VNGSU");
        System.out.println("Name : " + s2.name);
        System.out.println("Roll No : " + s2.rollNo);
        System.out.println("College Name : " + s2.collegeName);
        System.out.println("Age : " + s2.age);
    }
}

/*
 * Rules of Constructor(method ke trah hai)
 * 0. Jab Ham Object ko create karte tab us time per java ek default constructor
 * create karta hai
 * 1. Constructor name same hoga className
 * 2. No return type iska koi return type nahi hota nahi void.
 * 3. Constructor Automatic Call Ho jaata hai during object creation.
 * 4. Jab ham Object Ko initialize karte hai.
 * 5. It can also be overloaded.
 * 6. Agar Constructor mai enough space naa ho toh wah run time exception dega.
 */
class Student {
    int rollNo;
    String name;
    int age;
    String collegeName;

    // Default Constructor
    Student() {
        name = "Suraj Kumar";
        collegeName = "VNSGU";
        rollNo = 200;
        age = 21;
    }

    /*
     * Parameterized Constructor
     */
    Student(int rn, String n, int a, String cn) {
        this.rollNo = rn;
        this.name = n;
        this.age = a;
        this.collegeName = cn;
    }
}