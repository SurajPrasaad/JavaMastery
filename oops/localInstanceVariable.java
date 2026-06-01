public class localInstanceVariable {
    public static void main(String[] args) {
        Student s1 = new Student();

         //Default Value
        // System.out.println("Name : " + s1.name);
        // System.out.println("Age : " + s1.age);
        // System.out.println("Roll No : " + s1.rollNo);
        // System.out.println("CollegeName : " + s1.collegeName);

        s1.name = "Suraj Kumar";
        s1.rollNo = 1;
        s1.age = 101;
        s1.collegeName = "VNSGU";

        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
        System.out.println("Roll No : " + s1.rollNo);
        System.out.println("CollegeName : " + s1.collegeName);

        /*
         * Local Variable
         * Local Variable ke pass default value nahi hota hai q ki wah stack memory me
         * value ko store karta hai.iske under hame variable ko value ke saath initialize karna
         * padta hai warna wah error show karta hai.
         * `error: variable x might not have been initialized`
         */
        int x; // Local Variable
        System.out.println("X value is : " + x);
    }
}

/*
        * Instance Variable
        * Instance Variable ke pass default value hota hai q ki wah (heap memory) me
        * value ko store karta hai.
        * int => 0
        * float => 0.0
        * boolean => false
        * String => null
 */

class Student {
    int rollNo; // Instance Variable ke pass default values hoti hai.
    String name;
    int age;
    String collegeName;
}
