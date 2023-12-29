package miscellaneous.immutable;

import com.gs.Main;

public  class Employee {

    private final int   empId;
    private final String empName;
    private final Address address;


    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Address getAddress() {
        Address address1 = new Address();
        address1.setCountry(this.address.getCountry());
        address1.setPostalCode(this.address.getPostalCode());
        address1.setState(this.address.getState());
        return address1;
    }

    public Employee(int empId, String empName, Address address) {
        this.empId = empId;
        this.empName = empName;
        Address address1 = new Address();
        address1.setCountry(address.getCountry());
        address1.setPostalCode(address.getPostalCode());
        address1.setState(address.getState());
        this.address = address1;
    }




    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setPostalCode(12345);
        address1.setState("Kernatka");
        address1.setCountry("India");
        Employee employee = new Employee(1,"Sarwar",address1);
        System.out.println("employee postal code before modification::::"+employee.getAddress().getPostalCode());
        employee.getAddress().setPostalCode(456);
        System.out.println("employee postal code after modification:::::"+employee.getAddress().getPostalCode());
    }
}