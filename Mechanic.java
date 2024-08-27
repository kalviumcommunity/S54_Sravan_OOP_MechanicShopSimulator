public class Mechanic {
    private String name;
    private Repair currentRepair;

    public Mechanic(String name) {
        this.name = name;
    }

    public void assignRepair(Repair Repair) {
        this.currentRepair = Repair;
        System.out.println(name + " has been assigned to Repair: " + Repair.getDescription());
    }

    public void completeRepair() {
        if (currentRepair != null) {
            currentRepair.completeRepair();
            System.out.println(name + " has completed the Repair: " + currentRepair.getDescription());
            currentRepair = null;
        } else {
            System.out.println(name + " has no Repair assigned.");
        }
    }
}
