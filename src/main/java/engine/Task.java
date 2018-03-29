package engine;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

@DisallowConcurrentExecution
public class Task implements Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("kjkjkjkjkj");
//        File file = new File("/Users/alirahmani/IdeaProjects/testjarfile/out/artifacts/testjarfile_jar/testjarfile.jar");
//        URL[] urls = new URL[]{file.toURL()};
//        URLClassLoader child = new URLClassLoader(urls, this.getClass().getClassLoader());
//        Class classToLoad = Class.forName("testClass", true, child);
//        Method method = classToLoad.getDeclaredMethod("exec",String.class);
//        Object instance = classToLoad.newInstance();
//        Object result = method.invoke(instance,"khooobi");
    }
}
