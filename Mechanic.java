public class Mechanic {
    private String name;
    private Repair currentRepair;

    public Mechanic(String name) {
        this.name = name;
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

