package src.repairs;
public class Repair {
    private String description;
    private double laborCost;
    private double partsCost;
    private boolean isCompleted;
    
    private static int completedRepairs = 0;

    // Default Constructor
    public Repair() {
        this.description = "General Repair";
        this.laborCost = 100;
        this.partsCost = 50;
        this.isCompleted = false;
    }

    // Parameterized Constructor
    public Repair(String description, double laborCost, double partsCost) {
        this.description = description;
        this.laborCost = laborCost;
        this.partsCost = partsCost;
        this.isCompleted = false;
    }

    // Overloaded startRepair method with no parameters
    public void startRepair() {
        System.out.println("Starting repair: " + description);
    }

    // Overloaded startRepair method with additional details
    public void startRepair(String details) {
        System.out.println("Starting repair: " + description + ". Additional details: " + details);
    }

    // Overloaded startRepair method with additional details and estimated duration
    public void startRepair(String details, int durationHours) {
        System.out.println("Starting repair: " + description + ". Additional details: " + details + ". Estimated duration: " + durationHours + " hours.");
    }

    public void completeRepair() {
        this.isCompleted = true;
        completedRepairs++;
        System.out.println("Completed the repair: " + description);
    }

    public double calculateCost() {
        return laborCost + partsCost;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public static int getCompletedRepairsCount() {
        return completedRepairs;
    }
}
