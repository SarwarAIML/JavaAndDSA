package practice;

import java.util.Objects;

public class Employee {



  public     Employee(){
  }
    public Employee(int empId, String name) {
        this.empId = empId;
        Name = name;
    }

    public Employee(int empId, String name, double salray) {
        this.empId = empId;
        Name = name;
        this.salray = salray;
    }

    int empId;
    String Name ;

    double salray;

    public double getSalray() {
        return salray;
    }

    public void setSalray(double salray) {
        this.salray = salray;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        return Objects.equals(Name, employee.Name);
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        return result;
    }

/*    @Override
    public int compareTo(Employee o) {
        if(o.getEmpId()==this.getEmpId()) return 0;
        if(o.getEmpId()>this.getEmpId()) return 1;
        return -1;
    }*/
}
