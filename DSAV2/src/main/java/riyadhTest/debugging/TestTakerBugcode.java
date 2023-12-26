package riyadhTest.debugging;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestTakerBugcode {



    public static String prioritizedEvents( String[] events ) {

        java.time.LocalTime [][] eventsTime = new java.time.LocalTime[events.length][3];
        System.out.println(Arrays.deepToString(eventsTime));
        for(int i = 0; i < events.length; i++) {
            String event = events[i];
            java.time.LocalTime[] startEndTime = findTimeInLine(event);
            System.out.println(Arrays.toString(startEndTime));
            System.out.println(Arrays.toString(startEndTime));
            if (startEndTime[0] !=null)
            eventsTime[i][0] = startEndTime[0];
            System.out.println(Arrays.deepToString(eventsTime));
            if ( startEndTime[1] !=null)
            eventsTime[i][1] = startEndTime[1];
            System.out.println(Arrays.deepToString(eventsTime));
        }
        System.out.println(Arrays.deepToString(eventsTime));

        java.util.List<String> eventsToAccept = new java.util.ArrayList<String>();

        java.time.LocalTime START_TIME = java.time.LocalTime.parse("08:55");
        java.time.LocalTime END_TIME = java.time.LocalTime.parse("18:05");

        System.out.println(Arrays.deepToString(eventsTime[0]));
        System.out.println(Arrays.deepToString(eventsTime[1]));

        System.out.println(eventsTime[0][0]);
        System.out.println(eventsTime[0][1]);
        System.out.println(eventsTime[0][0]);
        System.out.println(eventsTime[0][1]);
        System.out.println(Arrays.deepToString(eventsTime));
        System.out.println("null".equals(eventsTime[0][0]));
        System.out.println((eventsTime[0][0])==null);
        System.out.println();






        System.out.println(eventsTime.length);
            for(int i = 0; i < events.length ; i++ ) {

               if( ((eventsTime[i][0])==null) ||((eventsTime[i][1])==null) ){
                   continue;
               }

                if(   eventsTime[i][0].isAfter(START_TIME) && eventsTime[i][0].isBefore(END_TIME)
                        && eventsTime[i][1].isAfter(START_TIME) && eventsTime[i][1].isBefore(END_TIME) ) {
                    long duration = java.time.temporal.ChronoUnit.MINUTES.between(eventsTime[i][0],eventsTime[i][1]);
                    START_TIME = START_TIME.plusMinutes(duration);

                    eventsToAccept.add(events[i]);
                } else {
                    START_TIME = START_TIME.plusHours(1);
                }
            }

        System.out.println("before for loop ");
        System.out.println("before for loop ");
        System.out.println("before for loop ");
        System.out.println("before for loop ");


        StringBuilder sb = new StringBuilder();
        sb.append("Events to accept:");
        for(String event: eventsToAccept) {
            sb.append(event).append(";");
        }
        return sb.toString();
    }
    private static java.time.LocalTime[] findTimeInLine(String line) {
       String regex = "(\\d{2}:\\d{2})[\\W]+(\\d{2}:\\d{2})[\\W]+(.*)";
        //String regex = "\\d{2}:\\d{2}";
        java.time.LocalTime[] startEndTime = new java.time.LocalTime[2];
        java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);
   //     System.out.println(m.find());

        int i = 0;
        if (m.find()) {
            try{
                java.time.LocalTime startTime = java.time.LocalTime.parse(m.group(1), java.time.format.DateTimeFormatter.ISO_TIME);
                if (startTime !=null)
                startEndTime[i] = startTime;
                java.time.LocalTime endTime = java.time.LocalTime.parse(m.group(2), java.time.format.DateTimeFormatter.ISO_TIME);
                if (endTime !=null)
                startEndTime[i+1] = endTime;

            }catch(java.time.format.DateTimeParseException ex) {
                startEndTime[i] = null;
            }
            i++;
        }
        System.out.println(Arrays.toString(startEndTime));
        return startEndTime;

    }

    public static void main(String[] args) {

        //  String regex = "(\\d{2}:\\d{2})[\\W]+(\\d{2}:\\d{2})[\\W]+(.*)";

        String[] events = new String[]{
                "9:00 : 10:00- Exercise",
               "10:00 @ 11:00 $ Meeting",
                "11:15 ? 12:30 /Lunch",
                "13:00 * 15:00 # Task 1",
                "15:15 - 16:00 Tahalla",
                "15:30 - 16:00 Appointment",
                "17:00 - 18:00 Dinner"

        };
        String result = prioritizedEvents(events);
        System.out.println(result);
    }


}
