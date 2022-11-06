class Employee{
    // Data members
    String name;
    int yearOfJoining;
    String address;

    // Constructor
    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Override method
    public String toString() {
        return this.name + " " + this.yearOfJoining + " " + this.address;
    }

}

class EmployeeClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John",2011,"Chandigarh");

        Employee employee2 = new Employee("William",2019,"Delhi");

        Employee employee3 = new Employee("Ramayan",2006,"Nebraska");
        
        System.out.println("Name " + "Year of joining " + "Address");
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
    }
}