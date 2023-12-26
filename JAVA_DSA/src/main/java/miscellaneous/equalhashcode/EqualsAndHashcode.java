package miscellaneous.equalhashcode;

class Employee{
    int id;
    String name;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return  ((this.id == employee.id) && (this.name == employee.name)) ;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class EqualsAndHashcode {

    public static void main(String[] args) {
        Employee employee1 = new Employee(10,"sarwar");
        Employee employee2 = new Employee(10,"sarwar");
        Employee employee3 = new Employee(15,"sarwar");
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee3));
    }
}
