public abstract class Employee {

    protected String name;
    protected int employeeid;
    protected double baseSalary;
    protected String department;

    public Employee(String name, int employeeid, double baseSalary, String department) {
        this.name = name;
        this.employeeid = employeeid;
        this.baseSalary = baseSalary;
        this.department = department;
        System.out.println("Employee " + name + " has been hired in " + department + " department");
    }

    public void displayInfo() {
        System.out.println("Employee Name:" + name);
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Department:" + department);
        System.out.println("Base Salary: $" + baseSalary);
    }

    public double calcualateSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void work(){
        System.out.println(name + "is working on general tasks");
    }
}
