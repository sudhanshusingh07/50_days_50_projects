public class Main {
    
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("raja", 1, 10000);
        PartTimeEmployee emp2 = new PartTimeEmployee("ram", 2, 10, 100);
        payrollSystem.addEmployrr(emp1);
        payrollSystem.addEmployrr(emp2);

        payrollSystem.displayEmployees();
    }
}
