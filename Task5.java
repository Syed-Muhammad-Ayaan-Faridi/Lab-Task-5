class Student{
    private int ID;
    private String Name;
    private int Marks;
    
    public Student(String name, int marks, int ID){
        this.ID = ID;
        this.Name = name;
        this.Marks = marks;
    }

    public void displayStudentDetails(){
        System.out.println("Student Name: "+Name+"\nStudent ID: "+ID+"\nStudent Marks: "+Marks);
    }
    public boolean isPassed(){
        if (Marks >= 40) {
            return true;
        }
        else{
            return false;
        }
    }

    public int getMarks() {
        return Marks;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setMarks(int marks) {
        Marks = marks;
    }
    public void setName(String name) {
        Name = name;
    }
}
class College{
    private String CollegeName;
    private String City;
    private Student[]  std;

    public College(String Cname, String city, Student[] students_arr) {
        this.CollegeName = Cname;
        this.City = city;
        this.std = students_arr;
    }

    public void displayCollegeDetails() {
        System.out.println("College Name: " + CollegeName + " \nCity: " + City);

        int totalStudents = std.length;
        int stdpass = 0;
        int stdfail = 0;
        double TotalMarks = 0;

        for (int i = 0;i < totalStudents;i++) {
            std[i].displayStudentDetails();
            TotalMarks += std[i].getMarks();
            if (std[i].isPassed()) {
                stdpass++;
            } 
            else {
                stdfail++;
            }
        }

        double average = TotalMarks / totalStudents;
        System.out.println("Total Students: " + totalStudents+ "\nPassed Students: "+stdpass+"\nFailed Students: " + stdfail +"\nAverage Marks: " + average);
    }
}
public class Task5 {
    public static void main(String[] args) {
        Student s1 = new Student("Aliyan",75, 1);
        Student s2 = new Student("Sarah",65, 2);
        Student s3 = new Student("Ahmed Mir",25,3);
        Student s4 = new Student("Faris", 33,4);
        Student s5 = new Student("Hasan Ali", 98,5);

        Student[] studentList = {s1, s2, s3, s4, s5};

        College college = new College("City College", "Karachi", studentList);

        college.displayCollegeDetails();
    }
}
