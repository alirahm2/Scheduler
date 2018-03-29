package engine;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import util.Jobs;

import java.util.ArrayList;

public class Scheduler {
    org.quartz.Scheduler scheduler;

    public Scheduler() {
        try {
            scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void addJob(Jobs jobList) throws SchedulerException {
        JobDetail job = JobBuilder.newJob(Task.class)
                .withIdentity("dummyJobName", "group1").build();
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("dummyTriggerName", "group1")
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(1).repeatForever())
                .build();
        org.quartz.Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
    }
}
