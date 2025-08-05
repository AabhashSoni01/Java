
// Job Sequencing with Deadlines
import java.util.*;

class Job {
    char id;
    int deadline, profit;

    Job(char id, int d, int p) {
        this.id = id;
        deadline = d;
        profit = p;
    }
}

public class JobSequencing {
    public static void main(String[] args) {
        Job[] jobs = {
                new Job('a', 2, 100), new Job('b', 1, 19),
                new Job('c', 2, 27), new Job('d', 1, 25), new Job('e', 3, 15)
        };
        jobScheduling(jobs);
    }

    public static void jobScheduling(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        boolean[] slot = new boolean[jobs.length];
        char[] result = new char[jobs.length];

        for (Job job : jobs) {
            for (int j = Math.min(jobs.length - 1, job.deadline - 1); j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    break;
                }
            }
        }

        System.out.print("Scheduled Jobs: ");
        for (int i = 0; i < jobs.length; i++) {
            if (slot[i])
                System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
