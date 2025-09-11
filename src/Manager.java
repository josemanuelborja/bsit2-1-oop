public class Manager extends Employee {

    private double bonus;
    private int teamSize;

    public Manager(String name, int employeeid,double baseSalary,String department, double bonus, int teamSize) {
        super(name, employeeid, baseSalary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + "has been promoted to Manager");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void work() {
        super.work();
        System.out.println(name + "is managing a team of " + teamSize + " employees");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize);
    }
}
