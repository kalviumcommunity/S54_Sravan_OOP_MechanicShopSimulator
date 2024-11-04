// Mechanic class extending Employee (Single Inheritance)
public class Mechanic extends Employee {
    private Repair currentRepair;
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

    @Override
    public void displayInfo() {
        System.out.println("Mechanic Name: " + name);
    }
}