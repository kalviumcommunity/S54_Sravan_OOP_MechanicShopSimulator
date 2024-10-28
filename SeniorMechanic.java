// SeniorMechanic class extending Mechanic (Multilevel Inheritance)
public class SeniorMechanic extends Mechanic {

    public SeniorMechanic(String name) {
        super(name); 
    }

    public void superviseRepair() {
        System.out.println(name + " is supervising the repair process.");
    }
}
