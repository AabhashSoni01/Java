
// Activity Selection Problem
import java.util.*;

class Activity {
    int start, finish;

    Activity(int s, int f) {
        start = s;
        finish = f;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        Activity[] activities = {
                new Activity(1, 3), new Activity(2, 4),
                new Activity(0, 6), new Activity(5, 7),
                new Activity(8, 9), new Activity(5, 9)
        };
        selectActivities(activities);
    }

    public static void selectActivities(Activity[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a.finish));
        System.out.println("Selected activities:");
        int lastEnd = -1;
        for (Activity act : arr) {
            if (act.start >= lastEnd) {
                System.out.println("(" + act.start + ", " + act.finish + ")");
                lastEnd = act.finish;
            }
        }
    }
}
