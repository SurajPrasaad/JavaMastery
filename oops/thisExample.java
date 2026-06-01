/* this Keyword =>
    This keyword ek reserved keyword hai jo denote karta hai current object ko jo declare ho raha hota hai. Iska use hum tab karte hain jab hume apne current object ke reference ki zarurat hoti hai, especially jab hum constructor ya method ke andar apne object ke variables ko refer karna chahte hain.
*/

/* Chaining in Constructor
    Constructor Overload => Chaining => Overload
    Constructor Chaining => Jab ek constructor apne class ke dusre constructor ko call karta hai, toh us process ko constructor chaining kehte hain. Iska use hum code reusability ke liye karte hain, jisse hum apne constructors ke beech mein common initialization code ko reuse kar sakte hain.
 */
public class thisExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 =new Student("Suraj Kumar",21);
        Student s4 = new Student("Niraj Kumar",20,"SLIET");
        Student s5 = new Student(102,"Krishna",23,"SCET");
        
    }
}

class Student{
    int rollNo;
    String name;
    int age;
    String collegeName;

    Student(){
        // this.name = "Unknown";
        // this.age = 0;
        // this.rollNo = 0;
        // this.collegeName = "UnkNown";

        this(0,"Unknown",0,"Unknown");
    }

    Student(int rollNo){
       this(rollNo,"Unknown",0,"Unknown");//Constructor Chaining
    }

    Student(String name,int age){
        this(106);//Constructor Chaining
        this.name = name;
        this.age = age;
    }

    Student(String name,int age,String collegeName){
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
    }

    Student(int rollNo,String name,int age,String collegeName){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
    }
}