package Constructors;

public class Student {

	String name ;
    int id;
    long mobNum ;
    
   /* Student(String firstName, int sID, long mNum) {
    name = firstName ;
    id = sID ;
    mobNum = mNum ;
    }*/
    
    // the instance variable and the parameter have the same name
    // Here, the Java compiler is confused due to name ambiguity.
   /* Student(String name, int id, long mobNum) {
        name = name ;
        id = id ;
        mobNum = mobNum ;
        }*/
    
    // In such a situation, we use this keyword to differentiate instance and Local variables For example
    Student(String name, int id, long mobNum) {
    	System.out.println("Hi");
        this.name = name ;
        this.id = id ;
        this.mobNum = mobNum ;
        
    }

public static void main(String[] args) {
// You need to add the L character to the end of the number to make Java recognize it as a long
	Student stu = new Student("Anup", 110484, 8861941818L) ;
	System.out.println(stu.name + " " + stu.id + " " + stu.mobNum);
}

	}

