public class Repair {
    private String description;
    private double laborCost;
    private double partsCost;
    private boolean isCompleted;

    private static int completedRepairs = 0;

    public Repair(String description, double laborCost, double partsCost) {
        this.description = description;
        this.laborCost = laborCost;
        this.partsCost = partsCost;
        this.isCompleted = false;
    }

    public void startRepair() {
        System.out.println("Starting repair: " + description);
    }

    public void completeRepair() {
        this.isCompleted = true;
        completedRepairs++; 
        System.out.println("Completed the repair: " + description);
    }

    public double calculateCost() {
        return laborCost + partsCost;
    }

    // Mutator (Setter) for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for description 
    public String getDescription() {
        return description;
    }
    //  Getter for completed status
    public boolean isCompleted() {
        return isCompleted;
    }

    public static int getCompletedRepairsCount() {
        return completedRepairs;
    }
}
