package src;
import java.util.ArrayList;

import src.employees.Mechanic;
import src.employees.SeniorMechanic;
import src.repairs.Repair;

public class Main {
    public static void main(String[] args) {
        // Using Liskov Substitution Principle: SeniorMechanic can be used as Mechanic
        Mechanic mechanic1 = new Mechanic("John Cena");
        Mechanic mechanic2 = new SeniorMechanic("The Undertaker"); // Substituting Mechanic with SeniorMechanic

        // Creating an array of Repair objects
        ArrayList<Repair> repairs = new ArrayList<>();
        repairs.add(new Repair("Replacing the battery", 300, 500));
        repairs.add(new Repair("Fixing the engine", 400, 800));
        repairs.add(new Repair("Oil change", 100, 200));

        System.out.println("Mechanic 1:");
        mechanic1.displayInfo();  // Display info of Mechanic instance
        System.out.println("Mechanic 2 (Senior Mechanic):");
        mechanic2.displayInfo();  // Display info of SeniorMechanic instance

        if (mechanic2 instanceof SeniorMechanic) {
            ((SeniorMechanic) mechanic2).superviseRepair();  // Only SeniorMechanic can supervise repairs
        }

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
