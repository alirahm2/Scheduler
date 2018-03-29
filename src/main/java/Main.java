import engine.Scheduler;
import org.quartz.SchedulerException;
import util.JobFileParser;

public class Main {
    public static void main(String[] args) throws SchedulerException {
//        JobFileParser jobFileParser = new JobFileParser();
//        jobFileParser.readConfigFile();
        Scheduler scheduler = new Scheduler();
        scheduler.addJob(null);

    }
}
