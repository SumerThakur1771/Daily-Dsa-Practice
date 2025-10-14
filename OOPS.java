public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Sumer");
        System.out.println(s1.name);
        s1.roll = 456;
        s1.password = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        System.out.println(s2.name);

        for(int mark : s2.marks){
            System.out.println(mark);
        }
        for(int mark : s1.marks){
            System.out.println(mark);
        }
    }
}


class Student{
    String name; 
    int roll;
    String password;
    int marks[];

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = "abc";
        marks = new int[3];
        // this.marks = s1.marks; // shallow copy
        for(int i = 0; i < 3; i++){
            this.marks[i] = s1.marks[i]; //deep copy
        }
    }

    Student(String name){ //constructor
        this.name = name;
        marks = new int[3];
    }
}