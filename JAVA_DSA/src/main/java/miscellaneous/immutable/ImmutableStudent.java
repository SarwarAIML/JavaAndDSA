package miscellaneous.immutable;

public class ImmutableStudent {

    private final int id;
    private final String name;
    private final Age age;


    public ImmutableStudent(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age temp = new Age();
        temp.setDay(age.getDay());
        temp.setMonth(age.getMonth());
        temp.setYear(age.getYear());
        this.age = temp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age temp = new Age();
        temp.setDay(this.age.getDay());
        temp.setMonth(this.age.getMonth());
        temp.setYear(this.age.getYear());
        return temp;
    }

    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        student.getAge().setYear(1993);
        System.out.println("Alex age year after modification = " + student.getAge().getYear());
    }
}
