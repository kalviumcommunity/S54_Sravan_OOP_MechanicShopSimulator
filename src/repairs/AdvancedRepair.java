package src.repairs;

// AdvancedRepair class extends Repair
public class AdvancedRepair extends Repair {
    private String additionalDetails;

    public AdvancedRepair(String description, double laborCost, double partsCost, String additionalDetails) {
        super(description, laborCost, partsCost);
        this.additionalDetails = additionalDetails;
    }

    @Override
    public void startRepair() {
        super.startRepair();
        System.out.println("Advanced repair details: " + additionalDetails);
    }
}