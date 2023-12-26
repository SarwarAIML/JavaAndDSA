package dsa1.riyadhTest;

public class StudentMarks1 {


    public static String newList(String[] students) {
        StringBuilder result = new StringBuilder();

        for (String studentDetails : students) {
            String[] parts = studentDetails.split("[^a-zA-Z0-9]+");
            int sum = 0;
            int count = 0;
            String studentName = "";

            for (String part : parts) {
                try {
                    int mark = Integer.parseInt(part);
                    if (mark >= 1 && mark <= 10) {
                        sum += mark;
                        count++;
                    }
                } catch (NumberFormatException ignored) {
                    studentName += part + " ";
                }
            }

            studentName = studentName.trim();
            int average = count > 0 ? sum / count : 0;
            result.append(studentName).append("-").append(average).append("; ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Example usage
        String[] studentMarks = {
                "Alice123456",    // Alice has marks: 1, 2, 3, 4, 5, 6
                "Bob98765",       // Bob has marks: 9, 8, 7, 6, 5
                "Charlie23456"    // Charlie has marks: 2, 3, 4, 5, 6
        };

        String result = newList(studentMarks);
        System.out.println(result);
    }
}
