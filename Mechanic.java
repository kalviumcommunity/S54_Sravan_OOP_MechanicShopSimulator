public class Mechanic {
    private String name;
    private Repair currentRepair;

    private static int mechanicCount = 0;

    public Mechanic(String name) {
        this.name = name;
        mechanicCount++; // Increment the static counter when a new mechanic is created
    }
      // Accessor (Getter) for name
      public String getName() {
        return name;
    }
    
    // Mutator (Setter) for name
    public void setName(String name) {
        this.name = name;
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
}
