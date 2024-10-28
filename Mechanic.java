// Mechanic class extending Employee (Single Inheritance)
public class Mechanic extends Employee {
    private Repair currentRepair;
    private static int mechanicCount = 0;

    // Default constructor
    public Mechanic() {
        super("DEFAULT Mechanic"); 
    }

    // Parameterized constructor
    public Mechanic(String name) {
        super(name);  
        mechanicCount++; 
    }

    // Static method to get the count of mechanics
    public static int getMechanicCount() {
        return mechanicCount;
    }

    public void assignRepair(Repair repair) {
        this.currentRepair = repair;
        System.out.println(name + " has been assigned to repair: " + repair.getDescription());
    }

    public void completeRepair() {
        if (currentRepair != null) {
            currentRepair.completeRepair();
            System.out.println(name + " has completed the repair: " + currentRepair.getDescription());
            currentRepair = null;
        } else {
            System.out.println(name + " has no repair assigned.");
        }
    }
}
