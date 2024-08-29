public class Mechanic {
    private String name;
    private Repair[] assignedRepairs;
    private int repairCount;

    public Mechanic(String name, int maxRepairs) {
        this.name = name;
        this.assignedRepairs = new Repair[maxRepairs];
        this.repairCount = 0;
    }

    public void assignRepair(Repair repair) {
        if (repairCount < assignedRepairs.length) {
            assignedRepairs[repairCount] = repair;
            repairCount++;
            System.out.println(name + " has been assigned to Repair: " + repair.getDescription());
        } else {
            System.out.println(name + " cannot take more repairs.");
        }
    }

    public void completeRepairs() {
        for (int i = 0; i < repairCount; i++) {
            if (assignedRepairs[i] != null && !assignedRepairs[i].isCompleted()) {
                assignedRepairs[i].completeRepair();
                System.out.println(name + " has completed the Repair: " + assignedRepairs[i].getDescription());
            }
        }
        repairCount = 0;
    }
}
