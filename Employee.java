public class Employee {
    String name;
    int id;
    double salary;
    int age;
    int phoneno;
    public Employee(String name, int id,double salary,int age,int phoneno){
     this.name=name;
     this.salary=salary; 
     this.age = age;
     this.phoneno=phoneno;

    }
    public void displayInfo(){
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Age: "+age);
        System.out.println("Phoneno :"+phoneno);
    }
    public static void main(String[]args){
        Employee emp1=new Employee("XYZ",101,50000.0,18,29967907);
        emp1.displayInfo();
    }
}