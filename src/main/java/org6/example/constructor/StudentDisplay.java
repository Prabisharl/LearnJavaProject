package org6.example.constructor;

public class StudentDisplay {
    int rollNo;
    String name;
    int marks;

    StudentDisplay(int r, String n, int m){
        rollNo=r;
        name=n;
        marks=m;
    }
    void display(){
        System.out.println("Rollno: "+rollNo +"\t Name: "+name+"\tMarks: "+marks);
    }

    public static void main(String[] args) {
        StudentDisplay sd1 = new StudentDisplay(9, "John", 50);
        StudentDisplay sd2 = new StudentDisplay(10, "Johny", 70);
        sd1.display();
        sd2.display();
    }
}
