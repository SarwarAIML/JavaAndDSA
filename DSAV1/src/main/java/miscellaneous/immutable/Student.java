package miscellaneous.immutable;

import java.util.HashMap;
import java.util.Map;

public final class Student {

    private final int studentId;
    private final String name;

    private final Map<String,String> metaData;

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMetaData() {
        Map<String,String> stringStringMap = new HashMap<String,String>();
        for (Map.Entry<String,String> entry:metaData.entrySet()){
            stringStringMap.put(entry.getKey(),entry.getKey());
        }

        return stringStringMap;
    }

    public Student(int studentId, String name, Map<String, String> metaData) {
        this.studentId = studentId;
        this.name = name;
        Map<String,String> stringStringMap = new HashMap<String,String>();
        for (Map.Entry<String,String> entry:metaData.entrySet()){
            stringStringMap.put(entry.getKey(),entry.getKey());
        }
        this.metaData = stringStringMap;
    }

    public static void main(String[] args) {
        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();

        map.put("1", "first");
        map.put("2", "second");

        Student s = new Student(101,"ABC" , map);

        System.out.println(s.getStudentId());
        System.out.println(s.getName());

        map.put("3", "third");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetaData());
        s.getMetaData().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetaData());
    }
}