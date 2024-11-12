package src.repairs;

import src.employees.Mechanic;

public class RepairManager {
    // RepairManager class handling repair assignments

    public void assignRepair(Mechanic mechanic, Repair repair) {
        System.out.println(mechanic.getName() + " has been assigned to repair: " + repair.getDescription());
    }

    public void completeRepair(Mechanic mechanic, Repair repair) {
        repair.completeRepair();
        System.out.println(mechanic.getName() + " has completed the repair: " + repair.getDescription());
    }
}

