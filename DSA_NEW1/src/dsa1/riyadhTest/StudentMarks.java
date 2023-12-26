package dsa1.riyadhTest;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMarks {
    public static String studentName ;
    public static String newList(String[] students) {
        // Map to store student name and their marks as a list
        Map<String, List<Integer>> studentMarksMap = new HashMap<>();
        // Split and process each student details
        for (String studentDetails : students) {
            String[] parts = studentDetails.split("\\W+");
            List<Integer> marks = new ArrayList<>();
             studentName = parts[0];
             marks = getMarks(parts,0);
            studentMarksMap.put(studentName, marks);
        }
        // Calculate and format the average marks
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : studentMarksMap.entrySet()) {
            String studentName = entry.getKey();
            List<Integer> marks = entry.getValue();
            double averageMark = 0.0;
            if (!marks.isEmpty()) {
                averageMark = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            }
            result.append(String.format("%s-%.2f;", studentName, averageMark));
        }
        return result.toString();
    }
    private static List<Integer> getMarks(String[] parts,int counter) {
        List<Integer> marks = new ArrayList<>();
        try {
            marks = Stream.of(parts).skip(counter+1)
                    .map(Integer::parseInt)
                    .filter(mark -> mark >= 1 && mark <= 10)
                    .collect(Collectors.toList());
        }catch (Exception e){
            counter++;
            studentName = studentName +" "+parts[counter];
            return getMarks(parts,counter);
        }
        return marks;
    }

    public static void main(String[] args) {
        String[] students = new String[] {

                "Madelin Chai lai 5 5 6",
                "KIm Roams :4 5 6",
                "Govind Kumar- 5 8",
                "Rajiv Kumar:5;5;8",
        };

        String averageMarks = newList(students);
        System.out.println(averageMarks);
    }
}