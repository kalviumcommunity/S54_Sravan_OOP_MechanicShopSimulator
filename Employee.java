// Abstract Employee class
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (virtual function) to be implemented by subclasses
    public abstract void displayInfo();
}
