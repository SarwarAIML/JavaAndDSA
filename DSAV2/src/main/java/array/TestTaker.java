package array;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestTaker {

    public static String prioritizedEvents(String[] events) {

        LocalTime[][] eventsTime = new LocalTime[events.length][2];
        for (int i = 0; i < events.length; i++) {
            String event = events[i];
            LocalTime[] startEndTime = findTimeInLine(event);
            eventsTime[i][0] = startEndTime[0];
            eventsTime[i][1] = startEndTime[1];
        }

        List<String> eventsToAccept = new ArrayList<>();

        LocalTime time = LocalTime.parse("09:00");
        while (!time.equals(LocalTime.parse("18:00"))) {
            for (int i = 0; i < events.length; i++) {
                if (time.equals(eventsTime[i][0])) {
                    long duration = java.time.temporal.ChronoUnit.MINUTES.between(eventsTime[i][0], eventsTime[i][1]);
                    time = time.plusMinutes(duration);
                    eventsToAccept.add(events[i]);
                }
            }
            time = time.plusHours(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Events to accept:");
        for (String event : eventsToAccept) {
            sb.append(" ").append(event).append(";");
        }

        return sb.toString();
    }

    private static LocalTime[] findTimeInLine(String line) {
        String regex = "\\d{2}:\\d{2}";
        LocalTime[] startEndTime = new LocalTime[2];
        java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);

        int i = 0;
        while (m.find() && i < 2) {
            try {
                startEndTime[i] = LocalTime.parse(m.group());
            } catch (java.time.format.DateTimeParseException ex) {
                startEndTime[i] = null;
            }
            i++;
        }
        return startEndTime;
    }
}
