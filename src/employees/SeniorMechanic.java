package src.employees;
// SeniorMechanic class extending Mechanic (Multilevel Inheritance)
// SeniorMechanic subclass replacing Mechanic in code

public class SeniorMechanic extends Mechanic {
    public SeniorMechanic(String name) {
        super(name);
    }

    public void superviseRepair() {
        System.out.println(getName() + " is supervising the repair process.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Senior Mechanic Name: " + getName());
    }
}
