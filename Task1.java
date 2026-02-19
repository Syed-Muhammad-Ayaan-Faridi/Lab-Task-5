class Student {
    //Declaration
    private String Name;
    private int StdID;
    private static int Studentcount = 0;
    //Parameterised Constructor 
    public Student(String name,int ID){
        Name = name;
        StdID = ID;
        Studentcount++;
    }
    //Printing number of students
    public static void getStdCount(){
        System.out.println("Total Students are: "+Studentcount);
    }
    //Printing Student Details
    public void StudentDetails(){
        System.out.println("Student Name: "+this.Name);
        System.out.println("Student ID: "+this.StdID);
    }
}
public class Task1 {
    public static void main(String[] args) {
        //Creating Student Objects
        Student S1 = new Student("Ayaan",1000);
        Student S2 = new Student("Zayan",1001);
        Student S3 = new Student("Aliyan",1002);
        //Printing student details 
        S1.StudentDetails();
        S2.StudentDetails();
        S3.StudentDetails();
        //Printing Total number of Student 
        Student.getStdCount();
    }
}
