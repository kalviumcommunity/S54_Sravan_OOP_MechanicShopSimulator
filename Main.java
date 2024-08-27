    /**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Mechanic mechanic = new Mechanic("Arjun Kotha");
        Repair repair1 = new Repair("Replacing the  battery", 300, 500);

        // the workflow
        // repair1.startRepair();
        // mechanic.assignRepair(repair1);
        // mechanic.completeRepair();
        
        // // Calculate and display the cost of the Repair
        // double totalCost = repair1.calculateCost();
        // System.out.println("Total cost of the Repair: $" + totalCost);
    }
    
}

