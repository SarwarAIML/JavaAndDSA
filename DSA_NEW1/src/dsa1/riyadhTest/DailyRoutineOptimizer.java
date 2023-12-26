package dsa1.riyadhTest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Question
 * You are very busy. From 9 AM till 6 PM you have various meetings. tasks, and appointments.
 * Your assistant has started creating an application to help optimize your daily routine.
 * The input is a list of events for one day. Each event is in the format
 * <starting time N><separators><ending time N><separators> <event title N>
 * The time format is: hh:mm
 * Separators can be any combination of non-alphanumeric characters.
 * The application must return a list of events that can be accepted. If two events overlap,
 * the one that is first in the list takes precedence. Events outside the 9 AM to 6 PM range should not be accepted.
 * Any events that are written in the wrong format can be ignored.
 * The events to accept should be organized in the following format:
 */

public class DailyRoutineOptimizer {
    private static final Pattern EVENT_PATTERN = Pattern.compile("(\\d{2}:\\d{2})[\\W]+(\\d{2}:\\d{2})[\\W]+(.*)");
    private static final LocalTime START_TIME = LocalTime.of(9, 0);
    private static final LocalTime END_TIME = LocalTime.of(18, 0);

    public static String optimizeDailyRoutine(String[] events) {
        // Parse and filter events
        List<Event> validEvents = Arrays.stream(events)
                .map(DailyRoutineOptimizer::parseEvent)
                .filter(Objects::nonNull)
                .filter(event -> isValidEvent(event))
                .collect(Collectors.toList());

        // Sort events by start time
        validEvents.sort(Comparator.comparing(Event::getStartTime));

        // Build optimized schedule
        AtomicReference<LocalTime> currentEndTime = new AtomicReference<>(START_TIME);
        StringBuilder schedule = new StringBuilder();
        validEvents.stream()
                .filter(event -> event.getStartTime().isAfter(currentEndTime.get()))
                .peek(event -> currentEndTime.set(event.getEndTime()))
                .map(Event::toString)
                .forEach(eventStr -> schedule.append(eventStr).append(";"));

        return schedule.toString();
    }
    private static Event parseEvent(String eventStr) {
        Matcher matcher = EVENT_PATTERN.matcher(eventStr);
        if (!matcher.matches()) {
            return null;
        }
        try {
            LocalTime startTime = LocalTime.parse(matcher.group(1), DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime endTime = LocalTime.parse(matcher.group(2), DateTimeFormatter.ofPattern("HH:mm"));
            String title = matcher.group(3);
            return new Event(startTime, endTime, title);
        } catch (Exception e) {
            return null;
        }
    }

    private static boolean isValidEvent(Event event) {
        return event.getStartTime().isAfter(START_TIME) && event.getStartTime().isBefore(END_TIME)
                && event.getEndTime().isAfter(START_TIME) && event.getEndTime().isBefore(END_TIME);
    }

    private static class Event {
        private final LocalTime startTime;
        private final LocalTime endTime;
        private final String title;

        public Event(LocalTime startTime, LocalTime endTime, String title) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.title = title;
        }
        public LocalTime getStartTime() {
            return startTime;
        }
        public LocalTime getEndTime() {
            return endTime;
        }
        @Override
        public String toString() {
            return String.format("%s - %s (%s)", startTime.format(DateTimeFormatter.ofPattern("HH:mm")),
                    endTime.format(DateTimeFormatter.ofPattern("HH:mm")), title);
        }
    }
    public static void main(String[] args) {
        String[] events = new String[]{
                "10:00 - 11:00 Meeting",
                "11:15 - 12:30 Lunch",
                "13:00 - 15:00 Task 1",
                "15:15 - 16:00 Tahalla",
                "15:30 - 16:00 Appointment",
                "17:00 - 18:00 Dinner",
                "9:00 - 10:00 Exercise" // Ignored: outside time range
        };

        String optimizedSchedule = optimizeDailyRoutine(events);
        System.out.println("Optimized schedule:");
        System.out.println(optimizedSchedule);
    }
}