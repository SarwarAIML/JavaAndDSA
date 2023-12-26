package riyadhTest;

/**
 *
 *
 * studen marks problems
 * ======================
 *
 * Imagine you are a teacher. At the end of the school year, you need to calculate the average marks of your students.
 *
 * The marks of the students are passed as an array of strings. Each student's details are provided in a
 * string in the following format: <student><mark 1><mark 2><mark N>
 *
 * Return a string in the following format
 * (without white-spaces): <student A>-<average mark>; <student B>-<average mark>;
 *
 * Take the following into account:
 *
 * Any kind of separator can be used in the string.
 * The mark is an integer from 1-10.
 * If the mark is out of that range, discard it, and don't use it in the average calculation
 *
 *
 */

public class TestTaker2 {

    public static String newList(String[] students){

        StringBuilder result = new StringBuilder();
        for (String studentDetails: students) {
            String[] parts = studentDetails.split("[^a-zA-Z0-9] +");
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
                } catch (NumberFormatException nfe) {

                    studentName += part + " ";

                }
            }
            studentName = studentName.trim();

            int average = count > 0 ? sum / count : 0;
            result.append(studentName).append("-").append(average).append(";");
        }
        return result.toString();
    }


    public static void main(String[] args) {
        // Example usage
        // Alice has marks: 1, 2, 3, 4, 5, 6
        // Bob has marks: 9, 8, 7, 6, 5
        // Charlie has marks: 2, 3, 4, 5, 6
        String[] students = new String[] {
                "John 8 7 9",
                "Mary 5 10 8",
                "David 4 9 6",
                "Alice 11 7 8",
                "Bob 5 10 9 1",
        };

        String averageMarks = newList(students);
        System.out.println(averageMarks);


    }
}
