package src;

import src.employees.Mechanic;
import src.employees.SeniorMechanic;
import src.repairs.Repair;
import src.repairs.AdvancedRepair;
import src.repairs.RepairManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // SRP: The Employee, Mechanic, SeniorMechanic, Repair, and RepairManager classes each have a single responsibility.
        
        // instances of Mechanic and SeniorMechanic
        Mechanic mechanic1 = new Mechanic("John");
        SeniorMechanic seniorMechanic = new SeniorMechanic("Alice");

        RepairManager repairManager = new RepairManager();

        //  Repair instances
        Repair basicRepair = new Repair("Battery Replacement", 300, 500);
        AdvancedRepair advancedRepair = new AdvancedRepair("Engine Overhaul", 700, 1200, "Engine diagnostics and tuning required");

        // Using Open/Closed Principle with Repair and AdvancedRepair
        ArrayList<Repair> repairs = new ArrayList<>();
        repairs.add(basicRepair);
        repairs.add(advancedRepair);

        // Assign and complete each repair, showcasing the Liskov Substitution Principle
        for (Repair repair : repairs) {
            repairManager.assignRepair(mechanic1, repair);
            repair.startRepair();  // Demonstrates polymorphism
            repairManager.completeRepair(mechanic1, repair);
        }

        // SeniorMechanic supervising repair work (Liskov Substitution - SeniorMechanic can replace Mechanic in management tasks)
        seniorMechanic.superviseRepair();

        // Display mechanic infor (SRP & Liskov)
        mechanic1.displayInfo();
        seniorMechanic.displayInfo();

        System.out.println("Total completed repairs: " + Repair.getCompletedRepairsCount());
    }
}
