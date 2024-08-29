public class Main {
    public static void main(String[] args) {

        // Creating a Mechanic
        Mechanic mechanic = new Mechanic("Arjun Kotha");

        // Creating an array of Repair objects
        Repair[] repairs = new Repair[3];
        repairs[0] = new Repair("Replacing the battery", 300, 500);
        repairs[1] = new Repair("Fixing the engine", 400, 800);
        repairs[2] = new Repair("Oil change", 100, 200);

        // Assign and complete each repair job
        for (Repair repair : repairs) {
            mechanic.assignRepair(repair);
            mechanic.completeRepair();
        }

        // the total cost of all repairs
        double totalCost = 0;
        for (Repair repair : repairs) {
            totalCost += repair.calculateCost();
        }
        System.out.println("Total cost of all repairs: $" + totalCost);
    }
}

