package src.employees;
// Mechanic class extending Employee (Single Inheritance)

public class Mechanic extends Employee {
    private static int mechanicCount = 0;

    public Mechanic() {
        super("DEFAULT Mechanic");
    }

    public Mechanic(String name) {
        super(name);
        mechanicCount++;
    }

    public static int getMechanicCount() {
        return mechanicCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mechanic Name: " + name);
    }
}
