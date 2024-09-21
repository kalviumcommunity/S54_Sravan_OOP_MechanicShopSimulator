import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a Mechanic using new for dynamic memory allocation
        Mechanic mechanic1 = new Mechanic("John Cena");
        Mechanic mechanic2 = new Mechanic("The Rock");

        // Creating an array of Repair objects
        ArrayList<Repair> repairs = new ArrayList<>();
        repairs.add(new Repair("Replacing the battery", 300, 500));
        repairs.add(new Repair("Fixing the engine", 400, 800));
        repairs.add(new Repair("Oil change", 100, 200));

        // Assign and complete each repair job
        for (Repair repair : repairs) {
            mechanic1.assignRepair(repair);
            mechanic1.completeRepair();
        }

        //  total count of mechanics and completed repairs
        System.out.println("Total number of mechanics: " + Mechanic.getMechanicCount());
        System.out.println("Total number of completed repairs: " + Repair.getCompletedRepairsCount());

        // Calculate the total cost of all repairs
        double totalCost = 0;
        for (Repair repair : repairs) {
            totalCost += repair.calculateCost();
        }
        System.out.println("Total cost of all repairs: $" + totalCost);
    }
}
