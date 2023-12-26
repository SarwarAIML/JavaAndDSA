package lectures;

public class Student {
    public int id;
    public String name;
    public String dept;
    public Student ( int id, String name, String dept ) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDept() {
        return this.dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}