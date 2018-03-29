package util;

public class JobDetail {
    String job_name = "";
    String jar_file_path = "";
    String cron_exp = "";


    public String getJar_file_path() {
        return jar_file_path;
    }

    public void setJar_file_path(String jar_file_path) {
        this.jar_file_path = jar_file_path;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getCron_exp() {
        return cron_exp;
    }

    public void setCron_exp(String cron_exp) {
        this.cron_exp = cron_exp;
    }
}
