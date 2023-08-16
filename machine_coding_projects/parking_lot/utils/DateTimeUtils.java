package machine_coding_projects.parking_lot.utils;

import java.util.Date;

public class DateTimeUtils {

    public static int calculateHours(Date entryTime, Date exitTime){
        long diffInMs = exitTime.getTime() - entryTime.getTime();
        return (int) Math.ceil(diffInMs/ (1000.0 * 60 * 60));
    }
}
