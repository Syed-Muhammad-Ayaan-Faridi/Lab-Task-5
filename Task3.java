class Employee{
    //Static members 
    private static double Bonus_Pool = 0.0;
    private static int TotalEmployee;
    private static double Percentage;
    //Non Static Data Members 
    private int EmpID;
    private String EmpName;
    private double BasicSalary;
    //Constructors
    public Employee(int empid,String empname,double salary,double percent){
        EmpID = empid;
        EmpName = empname;
        BasicSalary = salary;
        TotalEmployee++;
        Percentage = percent;
        Bonus_Pool = Bonus_Pool+((BasicSalary)*(Percentage/100));
    }
    public static void displayBonusPool(){
        System.out.println(Bonus_Pool);
    }
    public double getBasicSalary() {
        return BasicSalary;
    }
    public int getEmpID() {
        return EmpID;
    }
    public String getEmpName() {
        return EmpName;
    }
    public static int getTotalEmployee() {
        return TotalEmployee;
    }
    public void setBasicSalary(double basicSalary) {
        BasicSalary = basicSalary;
    }
    public void setEmpID(int empID) {
        EmpID = empID;
    }
    public static void setPercentage(double percentage) {
        Percentage = percentage;
    }
    public void setEmpName(String empName) {
        EmpName = empName;
    }
    
    public double calculateTotalCompensation(){
        return BasicSalary+(Bonus_Pool/TotalEmployee);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Hamza", 50000, 5);
        Employee emp2 = new Employee(2, "SAMMY", 51000, 5);
        Employee emp3 = new Employee(3, "Zaman", 150000, 5);
        Employee emp4 = new Employee(4, "Hamna", 120000, 5);
        System.out.println("Employee ID: "+emp1.getEmpID()+" Employee Name: "+emp1.getEmpName()+" Salary: "+emp1.getBasicSalary()+" Total Compensation: "+emp1.calculateTotalCompensation());
        System.out.println("Employee ID: "+emp2.getEmpID()+" Employee Name: "+emp2.getEmpName()+" Salary: "+emp2.getBasicSalary()+" Total Compensation: "+emp2.calculateTotalCompensation());
        System.out.println("Employee ID: "+emp3.getEmpID()+" Employee Name: "+emp3.getEmpName()+" Salary: "+emp3.getBasicSalary()+" Total Compensation: "+emp3.calculateTotalCompensation());
        System.out.println("Employee ID: "+emp4.getEmpID()+" Employee Name: "+emp4.getEmpName()+" Salary: "+emp4.getBasicSalary()+" Total Compensation: "+emp4.calculateTotalCompensation());
        Employee.displayBonusPool();
        System.out.println(Employee.getTotalEmployee());
    }
}
