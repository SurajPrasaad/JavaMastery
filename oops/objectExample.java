/*
    Object: ek real world entity ko represent karta hai. Object ke paas state (attributes) aur behavior (methods) hota hai. Object class ke instance hote hain, aur unka apna unique identity hota hai.yeh ek blueprint (class) se create hote hain. Object-oriented programming mein, hum objects ke through data aur functionality ko organize karte hain, jisse code modular, reusable, aur maintainable banta hai.
    
    Object Size: Object Headers(metadata) + Exact Data + Padding

    Object Metadata ki bytes hamesa 12 byte uska fix rahega.

   Objecty metadata : hamesa fix rahega 12 byte ka (4 byte ka class pointer + 8 byte ka wah) 
   Exact data  hai wah 1 byte leta hai q ki byte jo hai wah 1 byte leta hai = 13 byte + 3 byte ka padding = total 16 byte lagi hame person object ko memory me store karwane ke liye.
*/

public class objectExample {
    public static void main(String[] args) {

    }
}

/*
 * Objecty metadata : hamesa fix rahega 12 byte ka (4 byte ka class pointer + 8
 * byte ka wah)
 * Exact data hai wah 1 byte leta hai q ki byte jo hai wah 1 byte leta hai = 13
 * byte + 3 byte ka padding = total 16 byte lagi hame person object ko memory me
 * store karwane ke liye.
 */
class Student {
    byte age;
}