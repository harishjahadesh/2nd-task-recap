package personemp;

class Employee extends Person {
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 30, 12345, 75000);
        emp1.display();
        
        
        Employee emp2 = new Employee("smith", 25, 12445, 25000);
        emp2.display();
    }
}
