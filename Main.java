public class Main {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic("Arjun Kotha", 3);  // Mechanic can handle up to 3 repairs

        Repair repair1 = new Repair("Replacing the battery", 300, 500);
        Repair repair2 = new Repair("Oil change", 50, 150);
        Repair repair3 = new Repair("Brake pad replacement", 200, 300);

        // Assign repairs to the mechanic
        mechanic.assignRepair(repair1);
        mechanic.assignRepair(repair2);
        mechanic.assignRepair(repair3);

        // Complete assigned repairs
        mechanic.completeRepairs();
    }
}
