public class Developer extends Employee {

    private String programmingLangauge;
    private int projectsCompleted;

    public Developer (String name, int employeeid,double baseSalary,String department, String programmingLangauge, int projectsCompleted) {
        super(name, employeeid, baseSalary, department);
        this.programmingLangauge = programmingLangauge;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + "joined as a " + programmingLangauge + " Developer");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (projectsCompleted * 1000);
    }

    @Override
    public void work() {
        System.out.println(name + "is coding in" + programmingLangauge);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLangauge);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}
